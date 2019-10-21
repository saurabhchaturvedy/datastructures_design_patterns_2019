package creational.singleton;

public class BillPughSingletonExecutor {

	public static void main(String[] args) {
		System.out.println("Initializing Bill Pugh Singleton...");
		BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
		System.out.println("Hashcode of first bill Pugh singleton instance " + billPughSingleton.hashCode());
		BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
		System.out.println("Hashcode of second bill Pugh singleton instance " + billPughSingleton2.hashCode());
	}
}
