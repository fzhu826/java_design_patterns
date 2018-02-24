/**
 * 
 */
package structural.adapter;

/**
 * @author Administrator
 *
 */
public class Socket {
	public Volt getVolt(){
		return new Volt(120);
	}
}
