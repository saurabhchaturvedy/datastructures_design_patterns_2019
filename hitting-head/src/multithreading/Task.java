package multithreading;

import java.util.concurrent.atomic.AtomicLong;

public class Task implements Runnable {

	private final AtomicLong number;

	public Task(AtomicLong number) {
		this.number = number;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		number.incrementAndGet();
	}

}
