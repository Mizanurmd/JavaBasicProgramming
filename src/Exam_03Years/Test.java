package Exam_03Years;

 class A{
	void m1()throws ArrayIndexOutOfBoundsException{
		System.out.println("In m1 A");
	}
	
	  void m3() { System.out.println("in m3 A"); }
	 
}

class B extends A{
	void m1()throws IndexOutOfBoundsException{
		System.out.println("In m1 B");
	}
	
	void m2() {
		System.out.println("In m2 B");
	}
}
 
 
public class Test {
	public static void main(String[] args) {
		/*
		 * A a = new A(); a.m1(); a.m3();
		 */
		
		A a = new B();
		a.m1();
		a.m3();
		
	}

}
