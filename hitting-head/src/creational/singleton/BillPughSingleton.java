package creational.singleton;

public class BillPughSingleton {

	private BillPughSingleton() {
		// TODO Auto-generated constructor stub
	}

	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
