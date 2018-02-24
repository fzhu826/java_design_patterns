package creational.abstractfactory;

import creational.factory.Computer;

public class ComputerFactory {
	public static Computer createComputer(AbstractComputerFactory factory){
		return factory.createComputer();
	}
}
