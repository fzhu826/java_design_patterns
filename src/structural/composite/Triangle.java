/**
 * 
 */
package structural.composite;

/**
 * @author Administrator
 *
 */
public class Triangle implements Shape {

	/* (non-Javadoc)
	 * @see structural.composite.Shape#draw(java.lang.String)
	 */
	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Triangle with color "+fillColor);

	}

}
