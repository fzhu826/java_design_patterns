/**
 * 
 */
package creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class Employees implements Cloneable {
	private List<String> empList;
	
	public Employees(){empList =new ArrayList<String>();}

	public Employees(List<String> empList) {
		this.empList = empList;
	}

	public List<String> getEmpList() {
		return empList;
	}
	
	public void loadData(){
		empList.add("Jack");
		empList.add("Rek");
		empList.add("Bay");
		empList.add("Liss");

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
			List<String> temp = new ArrayList<String>();
			
			for (String t : this.getEmpList()){
				temp.add(t);
			}
			return new Employees(temp);
			
	}
	
	
	
	
}
