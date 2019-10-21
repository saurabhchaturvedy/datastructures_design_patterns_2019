package creational.singleton;

public class DoubleCheckingLazySingleton {

	private static DoubleCheckingLazySingleton instance;

	private DoubleCheckingLazySingleton() {
		// TODO Auto-generated constructor stub
	}

	public static DoubleCheckingLazySingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckingLazySingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckingLazySingleton();
					return instance;
				} else {
					return instance;
				}
			}
		}
		return instance;
	}

}
