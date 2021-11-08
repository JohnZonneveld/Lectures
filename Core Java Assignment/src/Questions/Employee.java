package Questions;

import java.util.Comparator;

class Employee implements Comparable<Employee> {
  private String name;
  private String department;
  private int age;
 
  public static class OrderByName implements Comparator<Employee> {
   @Override
   public int compare(Employee e1, Employee e2) {
	   return e1.name.compareTo(e2.name);
   }
  }
  
  public Employee(String name, String department, int age) {
	  this.name = name;
	  this.department = department;
	  this.age = age;
  }
 
  @Override
  public String toString() {
    return name + ", " + department + ", " + age;
  }
 
  // the old way to implement CompareTo method to compare
  public int compareTo(Employee b) {
    int i = this.name.compareTo(b.name);
    if (i != 0)
      return i;
 
    i = this.department.compareTo(b.department);
    if (i != 0)
      return i;
 
    return Integer.compare(this.age, b.age);
  }


  

  

 

 

}

