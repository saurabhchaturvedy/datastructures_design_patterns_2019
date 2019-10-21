package creational.singleton;

import java.io.Serializable;

public class LazySingleton extends MyClone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException();
	}

	private static LazySingleton instance;

	private LazySingleton() {
		// TODO Auto-generated constructor stub
		if (instance != null)
			throw new IllegalStateException("LazySingleton cannot be initializes via singletion ...");
	}

	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
			return instance;
		} else {
			return instance;
		}
	}
	
	protected Object readResolve()
	{
		return instance;
	}
}
