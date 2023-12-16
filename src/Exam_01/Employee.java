package Exam_01;

public class Employee {
	private int id;
	private String name;
	
 Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
 public static Employee employeeInstats() {
	 return new Employee(1, "Mizanur Rahman");
 }

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}
 
 

}
