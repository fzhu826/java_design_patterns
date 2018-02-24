package creational.builder;
public class   Computer {
	//required parameters
	private String ram;
	private String hdd;
	
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	/*
	 * Notice that Computer class has only getter methods 
	 * and no public constructor. So the only way to get a Computer object
	 *  is through the ComputerBuilder class.
	 */
//	public Computer(String ram, String hdd ){
//		this.ram=ram;
//		this.hdd=hdd;
//	}
	 
	private Computer (ComputerBuilder builder){
		this.hdd=builder.hdd;
		this.ram=builder.ram;
		this.isBluetoothEnabled=builder.isBluetoothEnabled;
		this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
	}
	public String getRAM() {
		return this.ram;
	}

	 
	public String getHDD() {
		return this.hdd;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

 
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
 
	public static class ComputerBuilder{
		
		//required parameters
		private String ram;
		private String hdd;
		
		//optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		public ComputerBuilder (String ram,String hdd){
			this.ram=ram;
			this.hdd=hdd;
		}
		
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled){
			this.isBluetoothEnabled= isBluetoothEnabled;
			return this;
		}
		public ComputerBuilder setGraphicsCardsEnabled(boolean isGraphicsCardEnabled)
		{
			this.isGraphicsCardEnabled=isGraphicsCardEnabled;
			return this;
		}
		public Computer build (){
			 return new Computer(this);
		}
	}

}