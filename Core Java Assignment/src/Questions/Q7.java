package Questions;

import java.util.ArrayList;
import java.util.List;

public class Q7 {
	String Name;
	String Department;
	int Age;
	
	public void Employee(String name, String department, int age) {
		this.Name = name;
		this.Department = department;
		this.Age = age;
	}
	
	List<Object> employees = new ArrayList<Object>();
	employees.add(new Employee("Steve","Design", 45));
	
    

	public static void compareEmployees(String[] args) {
		// test

	}

}
