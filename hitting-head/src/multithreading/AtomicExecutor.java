package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicExecutor {

	public static void main(String[] args) {
		
		

		AtomicLong atomicLong = new AtomicLong(0);
		ExecutorService executorService = Executors.newFixedThreadPool(16);
		for (int i = 0; i < 100; i++) {
			executorService.submit(new Task(atomicLong));
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(atomicLong.get());
	}
}
