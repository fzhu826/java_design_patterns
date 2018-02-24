/**
 * 
 */
package creational.singleton;

/**
 * @author Administrator
 * 
  This implementation works fine and provides thread safety but
  it reduces performance because of cost associated with the synchronized method
  although we need it only for first few threads who might create the separate 
  instance.
  
  to avoid the extra overhead every time, we use  double checking locking
  principle is used in this approach  the synchronized block is
   used inside  the if condition with an additional check to ensure that 
   only one instance of singleton class is created.
 */
public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance ;
	
	
	 
	private ThreadSafeSingleton(){}
	public static synchronized ThreadSafeSingleton getInstance(){
		if(instance==null){
			instance= new ThreadSafeSingleton();
		}
		return instance;
	}
	public static   ThreadSafeSingleton getInstanceDoubleChecking(){
		if(instance==null){
			synchronized (instance){
				if(instance==null){
				instance= new ThreadSafeSingleton();
				}
			}
			
		}
		return instance;
	}

}
