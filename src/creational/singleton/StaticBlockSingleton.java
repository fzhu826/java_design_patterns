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
public class StaticBlockSingleton {
	private static StaticBlockSingleton instance ;
	
	
	{
		try {
			instance= new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("create instance failure");
		}
	}
	private StaticBlockSingleton(){}
	public static StaticBlockSingleton getInstance(){
		return instance;
	}

}
