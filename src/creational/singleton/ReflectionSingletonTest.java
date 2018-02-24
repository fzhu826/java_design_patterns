/**
 * 
 */
package creational.singleton;

import java.lang.reflect.Constructor;

/**
 * @author Administrator
 * 
 * 
 *  you will notice that hashCode of both the instances
 *   are not same that destroys the singleton pattern.
 *   
 *   
 * 
 */
public class ReflectionSingletonTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EagerInitializationSingleton instanceOne = EagerInitializationSingleton
				.getInstance();

		EagerInitializationSingleton instanceTwo = null;
		try {
 			Constructor[] constructor = EagerInitializationSingleton.class.getDeclaredConstructors();
			// getConstructor(); only return the public ones of above.
			for (Constructor con : constructor) {
				con.setAccessible(true);
				instanceTwo = (EagerInitializationSingleton) con.newInstance();
				break;

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

}
