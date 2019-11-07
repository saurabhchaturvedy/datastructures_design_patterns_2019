package multithreading;

public class SimpleBlockingQueue {

	private Object[] entries = new Object[2];
	int putptr, takeptr, count;

	private synchronized void put(Object x) throws InterruptedException {
		while (count == entries.length)
			wait();
		entries[putptr] = x;
		if (++putptr == entries.length)
			putptr = 0;
		count++;
		notifyAll();
	}

	private synchronized int get() throws InterruptedException {
		int x = 0;
		while (count == 0)
			wait();
		entries[takeptr] = x;
		if (++takeptr == entries.length)
			takeptr = 0;
		takeptr = 0;
		notifyAll();
		return x;
	}

	public static void main(String[] args) throws InterruptedException {
		SimpleBlockingQueue simpleBlockingQueue = new SimpleBlockingQueue();
		simpleBlockingQueue.put(20);
		simpleBlockingQueue.put(50);

	}
}
