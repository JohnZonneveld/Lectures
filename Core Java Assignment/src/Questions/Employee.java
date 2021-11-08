package Questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Employee implements Comparator<Employee> {
  	String name, department;
  	int age;
  	
  	public int compare(Employee e1, Employee e2) {
  		if (e1.name == e2.name) {
  			if (e1.department == e2.department) {
  				return Integer.compare(e1.age, e2.age);
  			} else {
  				return e1.department.compareTo(e2.department);
  			}
  		} else {
  			return e1.name.compareTo(e2.name);
  		}
  	}
  	
  	public String toString() {
  		return name + ", " + department + ", " + age + ".";
  	}
  
  public void Compare() {
	  Employee emp1 = new Employee();
	  emp1.name = "Daisy Duck";
	  emp1.department = "Design";
	  emp1.age = 32;
	  Employee emp2 = new Employee();
	  emp2.name = "Donald Duck";
	  emp2.department = "Implementation";
	  emp2.age = 58;
	  Employee emp3 = new Employee();
	  emp3.name = "Donald Duck";
	  emp3.department = "Design";
	  emp3.age = 21;
		
	  ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
	  listOfEmployees.add(emp1);
	  listOfEmployees.add(emp2);
	  listOfEmployees.add(emp3);
	  
	  Collections.sort(listOfEmployees, new Employee());
	  System.out.println("\n\033[1mQ7\nSorted Employees: \033[0m");
	  for (int i = 0; i <listOfEmployees.size(); ++i) {
		  System.out.println(listOfEmployees.get(i).toString());
	  }
  }

}

