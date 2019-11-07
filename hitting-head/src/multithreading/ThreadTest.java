package multithreading;

public class ThreadTest {

	public static void main(String[] args) {
       
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("hello in t1");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("hello in t2");
			}
		});
		
		t1.start();
		t2.start();
	}
	

}
