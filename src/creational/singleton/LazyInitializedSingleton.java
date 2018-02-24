/**
 * 
 */
package creational.singleton;

/**
 * @author Administrator
 * 
 instance of class is created in the static block that 
 provides option for exception handling.
 
 
 It creates instances before it is being used . not best practice to use.
 
 	learn that How to create singleton that support lazy-initialization 
 */
public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance ;
	
	
	 
	private LazyInitializedSingleton(){}
	public static LazyInitializedSingleton getInstance(){
		if(instance==null){
			instance= new LazyInitializedSingleton();
		}
		return instance;
	}

}
