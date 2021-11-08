//package Questions;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class Q7 {
//
//	public static void sortEmployees(String[] args) {
//		// TODO Auto-generated method stub
//		List<Employee> listOfEmployees = new ArrayList<>();
//		Employee emp1 = new Employee("Donald Duck", "Design", 32);
//		Employee emp2 = new Employee("Donald Duck", "Implementation", 42);
//		Employee emp3 = new Employee("Donald Duck", "Implementation", 38);
//		
//		listOfEmployees.add(emp1);
//		listOfEmployees.add(emp2);
//		listOfEmployees.add(emp3);
//	
//	
//	Collections.sort(listOfEmployees, new Comparator<Employee>() {
//		
//		@Override public int compare( final Employee emp1, final Employee emp2) {
//			int c;
//			c = emp1.getname().compareTo(emp2.getname());
//			if (c == 0)
//				c = emp1.getdepartment().compareTo(emp2.getdepartment());
//			return c;
//		}
//		
//	
//	});
//	for (Employee emp : listOfEmployees) {
//	    System.out.println(emp.getname()+" - "+emp.getdepartment()+ " - " +emp.getage());
//	}
//	}}
//
package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q7 {
	
	public static void main (String args[]) {
		Employee emp1 = new Employee("Daisy Duck", "Design", 32);
		Employee emp2 = new Employee("Donald Duck", "Implementation", 58);
		Employee emp3 = new Employee("Donald Duck", "Design", 21);
		
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		
		listOfEmployees.add(emp1);
		listOfEmployees.add(emp2);
		listOfEmployees.add(emp3);
		
		System.out.println("\033[1mQ7 Unsorted list : \033[0m" + listOfEmployees);
		
		Collections.sort(listOfEmployees, new Employee.OrderByName());
        System.out.println("\033[1mQ7 List (Comparator) : \033[0m" + listOfEmployees);

		
		
	}
}
