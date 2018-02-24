package creational.factory;

/**
 * 
 * Factory Design Pattern Examples in JDK
1.java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
2.valueOf() method in wrapper classes like Boolean, Integer etc.
 * 
 * @author Administrator
 *
 */
public class TestFactory {
	
	
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}
}