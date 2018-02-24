package creational.builder;

public class TestBuilderPattern {
	public static void main(String[] args) {
	
		Computer computer = new Computer.ComputerBuilder("ram", "hdd")
		.setBluetoothEnabled(true).setGraphicsCardsEnabled(false).build();
		
	}
}
