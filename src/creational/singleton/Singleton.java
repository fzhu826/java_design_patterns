/**
 * Java Singleton
Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
The singleton class must provide a global access point to get the instance of the class.
Singleton pattern is used for logging, drivers objects, caching and thread pool.
Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.
Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop.



In further sections, we will learn different approaches of Singleton pattern implementation 
and design concerns with the implementation.

Eager initialization
Static block initialization
Lazy Initialization
Thread Safe Singleton
Bill Pugh Singleton Implementation
Using Reflection to destroy Singleton Pattern
Enum Singleton
Serialization and Singleton
 * 
 */
package creational.singleton;

/**
 * @author Administrator
 *
 */
public class Singleton {
	
	private static Singleton instance;
	private Singleton(){
	}

	public static Singleton getInstance(){
		if(instance==null){
			instance  = new Singleton();
		}
		return instance;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
