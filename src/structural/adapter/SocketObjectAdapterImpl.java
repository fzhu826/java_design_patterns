package structural.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter{
	
	private Socket socket=new Socket();
	@Override
	public Volt provide3Volts() {
		Volt v = socket.getVolt();
		return convert(v, 40);
	}

	@Override
	public Volt provide12Volts() {
		Volt v =  socket.getVolt();
		return convert(v, 10);
	}

	@Override
	public Volt provide120Volts() {
		return   socket.getVolt();
	}
	private Volt convert(Volt v, int i) {
		v.setVolts(v.getVolts()/i);
		return v;
	}
}

