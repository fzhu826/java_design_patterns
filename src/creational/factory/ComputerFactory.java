package creational.factory;
/**
 * We can keep Factory class Singleton or we can keep the method that returns the subclass as static.
Notice that based on the input parameter, different subclass is created and returned. getComputer is the factory method.
 * @author Administrator
 *
 *
 *
 *Factory design pattern provides approach to code for interface rather than implementation.
 *
 *Factory pattern removes the instantiation of 
 *actual implementation classes from client code.
 * Factory pattern makes our code more robust, 
 * less coupled and easy to extend. For example, 
 * we can easily change PC class implementation
 * because client program is unaware of this.
 * 
 * Factory pattern provides abstraction between implementation 
 * and client classes through inheritance.
 * 
 */
public class ComputerFactory {

	public static Computer getComputer(String type,String ram,String cpu, String hdd){
		if(type.equals("pc"))
		{
			return new PC(ram,hdd,cpu);
		}else if(type.equals("server")){
			return new Server(ram,hdd,cpu);
		}
		return null;
	}
}
