package structural.adapter;

public class AdapterPatternTest {
	public static void main(String[] args) {
			testClassAdapter();
			testObjectAdapter();
	}
	public static void testClassAdapter(){
		SocketAdapter impl = new SocketClassAdapterImpl();
		
		Volt v3 = getVolt(impl,3);
		Volt v12 = getVolt(impl,12);
		Volt v120 = getVolt(impl,120);
		System.out.println("v3 volts using Class Adapter="+v3.getVolts());
		System.out.println("v12 volts using Class Adapter="+v12.getVolts());
		System.out.println("v120 volts using Class Adapter="+v120.getVolts());
		
	}
	public static void testObjectAdapter(){
		SocketAdapter impl = new SocketObjectAdapterImpl();
		
		Volt v3 = getVolt(impl,3);
		Volt v12 = getVolt(impl,12);
		Volt v120 = getVolt(impl,120);
		System.out.println("v3 volts using Object Adapter="+v3.getVolts());
		System.out.println("v12 volts using Object Adapter="+v12.getVolts());
		System.out.println("v120 volts using Object Adapter="+v120.getVolts());
		
	}
	
	
	
	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i){
		case 3: return sockAdapter.provide3Volts();
		case 12: return sockAdapter.provide12Volts();
		case 120: return sockAdapter.provide120Volts();
		default: return sockAdapter.provide120Volts();
		}
	}
}


