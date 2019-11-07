package multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ImprovedBlockingQueue {

	private Lock lock = new ReentrantLock();
	private Object[] entries = new Object[100];
	int putptr, takeptr, count;
	private Condition whenNotFull = lock.newCondition();
	private Condition whenNotEmpty = lock.newCondition();

	private void put(Object x) throws InterruptedException {
		lock.lock();
		try {
			if (count == entries.length)
				whenNotFull.await();
			entries[putptr] = x;
			if (++putptr == entries.length)
				putptr = 0;
			count++;
			whenNotEmpty.signal();
		} finally {
			lock.unlock();
		}

	}

	private Object get() throws InterruptedException {
		Object x = 0;
		lock.lock();
		try {
			while (count == 0)
				whenNotEmpty.wait();
			x = entries[takeptr];
			if (++takeptr == entries.length)
				takeptr = 0;
			--count;
			whenNotFull.signal();

		} finally {
			lock.unlock();
		}
		return x;
	}
}
