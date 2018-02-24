package structural.adapter;
/*
 * Some of the adapter design pattern example I could easily find in JDK classes are;

java.util.Arrays#asList()
java.io.InputStreamReader(InputStream) (returns a Reader)
java.io.OutputStreamWriter(OutputStream) (returns a Writer)
 */
public interface SocketAdapter {
	public Volt provide3Volts();
	public Volt provide12Volts();
	public Volt provide120Volts();
}
