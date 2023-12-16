package Exam_PrototypeDesignPattern;

public class TestMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		Department d = new Department("C-100", "Software Department");
		Employee em = new Employee(1, "Mizanur Rahman","Adabor-10, Dhaka-1207", d);
		System.out.println("Object is created from source ="+ em);
		
		Employee colenObject = (Employee) em.clone();
		System.out.println("Object is created from clone = "+ colenObject);
		
	}

}
