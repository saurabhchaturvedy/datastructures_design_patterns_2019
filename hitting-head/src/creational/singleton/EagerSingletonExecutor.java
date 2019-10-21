package creational.singleton;

public class EagerSingletonExecutor {

	public static void main(String[] args) {
		System.out.println("Initializing Eager Singleton...");
		EagerSingleton eagerSingleton = EagerSingleton.getInstance();
		System.out.println("Hashcode of first singleton object " + eagerSingleton.hashCode());
		EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
		System.out.println("Hashcode of second singleton object " + eagerSingleton2.hashCode());
	}
}
