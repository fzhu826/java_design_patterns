/**
 * 
 */
package structural.adapter;

/**
 * @author Administrator
 * 
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	 
	@Override
	public Volt provide3Volts() {
		Volt v = getVolt();
		return convert(v, 40);
	}

	@Override
	public Volt provide12Volts() {
		Volt v = getVolt();
		return convert(v, 10);
	}

	@Override
	public Volt provide120Volts() {
		return  getVolt();
	}

	private Volt convert(Volt v, int i) {
		v.setVolts(v.getVolts()/i);
		return v;
	}
}
