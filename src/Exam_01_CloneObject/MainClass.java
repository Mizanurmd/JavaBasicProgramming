package Exam_01_CloneObject;

public class MainClass {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee emp = new Employee();
		emp.setId(120);
		emp.setName("Mizanur Rahman");
		System.out.println("From Soursce Object ="+emp.getId()+ " name is "+ emp.getName());
		
		////////// Create a clone object here
		Employee emp2 = (Employee) emp.clone();
		System.out.println("From Clone Object ="+emp2.getId()+ " name is "+ emp2.getName());
	}

}
