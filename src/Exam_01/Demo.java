package Exam_01;



public class Demo extends A {
	public static void main(String[] args) {
		
	System.out.println(Employee.employeeInstats());
	 
	Demo a  = new Demo();
	
	a.testAbstract();
	a.display();
	
	B b = new B();
	b.dispaly2();
	
		
	}

	@Override
	public void display() {
		
		System.out.println("Abstract method is calling here ==============");
		
	}

	
	
}
