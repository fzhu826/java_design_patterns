package creational.prototype;

import java.util.List;

public class PrototypePatternTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employees em = new Employees();
		em.loadData();
		//use cloen to get obj
		Employees empsNew = (Employees)em.clone();
		Employees empsNew2 = (Employees)em.clone();
		
		List<String> empList = empsNew.getEmpList();
			empList.add("Irin");
		List<String> empList2 = empsNew2.getEmpList();
		empList2.remove("Jack");
		
		System.out.println("emps List: "+em.getEmpList());
		System.out.println("empsNew List: "+empList);
		System.out.println("empsNew2 List: "+empList2);
		
				
	}
}