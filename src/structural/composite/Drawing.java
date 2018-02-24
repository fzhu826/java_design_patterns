/**
 * 
 */
package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class Drawing implements Shape {
	List<Shape> shapes = new ArrayList<Shape>();
	/* (non-Javadoc)
	 * @see structural.composite.Shape#draw(java.lang.String)
	 */
	@Override
	public void draw(String fillColor) {
		for(Shape sh : shapes)
		{
			sh.draw(fillColor);
		}
	}
 public void add(Shape shape){
	 this.shapes.add(shape);
 }
 public void remove(Shape shape){
	 this.shapes.remove(shape);
 }
 public void clear(){
	 this.shapes.clear();
 }
}
