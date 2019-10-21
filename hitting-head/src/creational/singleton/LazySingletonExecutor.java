package creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;

public class LazySingletonExecutor {

	public static void main(String[] args)
			throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("Initializing Lazy Singleton...");
		LazySingleton reflectionInstance = null;
		LazySingleton lazySingleton = LazySingleton.getInstance();
		System.out.println("Hashcode of first lazy singleton instance " + lazySingleton.hashCode());

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		objectOutputStream.writeObject(lazySingleton);
		objectOutputStream.close();
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("singleton.ser"));
		LazySingleton readObject = (LazySingleton) objectInputStream.readObject();
		objectInputStream.close();
		System.out.println("Hashcode of seriliazed instance instance " + readObject.hashCode());
		// LazySingleton lazySingleton2 = (LazySingleton) lazySingleton.clone();
		// System.out.println("Hashcode of second lazy singleton instance " +
		// lazySingleton2.hashCode());
//		Constructor[] declaredConstructors = LazySingleton.class.getDeclaredConstructors();
//		for(Constructor c : declaredConstructors)
//		{
//			c.setAccessible(true);
//			reflectionInstance = (LazySingleton) c.newInstance();
//		}
//		System.out.println("hascode of reflection instance "+reflectionInstance.hashCode());
	}
}
