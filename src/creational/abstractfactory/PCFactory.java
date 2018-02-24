/**
 * 
 */
package creational.abstractfactory;

import creational.factory.Computer;
import creational.factory.PC;

/**
 * @author Administrator
 *
 */
public class PCFactory implements AbstractComputerFactory {

	
	private String hdd;private String cpu;private String ram;
	
	
	public PCFactory(String hdd, String cpu, String ram) {
		super();
		this.hdd = hdd;
		this.cpu = cpu;
		this.ram = ram;
	}


	/* (non-Javadoc)
	 * @see creational.abstractfactory.AbstractComputerFactory#createComputer()
	 */
	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new PC(ram,hdd,cpu);
	}

}
