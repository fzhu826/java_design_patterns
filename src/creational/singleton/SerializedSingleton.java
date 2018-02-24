package creational.singleton;

import java.io.Serializable;

 
/**
 * Sometimes in distributed systems, we need to implement Serializable interface
 * in Singleton class so that we can store it¡¯s state in file system and
 * retrieve it at later point of time. Here is a small singleton class that
 * implements Serializable interface also.
 * 
 * @author Administrator
 * 
 */
public class SerializedSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SerializedSingleton() {
	}

	private static class SerializedSingletonHelper {

		private static final SerializedSingleton INSTANCE = new SerializedSingleton();

	}

	public static SerializedSingleton getInstance() {
		return SerializedSingletonHelper.INSTANCE;
	}
	
/**
 * So it(refer to SingletonSerializedTest main method different hashcodes) destroys the singleton pattern, to overcome this scenario 
 * all we need to do it provide the implementation of readResolve() method.
 * @return
 */
	protected Object readResolve(){
		return getInstance();
	}

}
