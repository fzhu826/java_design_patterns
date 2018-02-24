package creational.abstractfactory;

import creational.factory.Computer;
/**
 * 
 * Abstract Factory Design Pattern Examples in JDK
1.javax.xml.parsers.DocumentBuilderFactory#newInstance()
2.javax.xml.transform.TransformerFactory#newInstance()
3.javax.xml.xpath.XPathFactory#newInstance()


 * @author Administrator
 *
 */
public class TestDesignPatterns {

	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Computer pc = ComputerFactory.createComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		Computer server = ComputerFactory.createComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc);
		System.out.println("AbstractFactory Server Config::"+server);
	}
}