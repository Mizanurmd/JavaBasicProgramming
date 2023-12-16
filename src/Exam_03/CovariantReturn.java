package Exam_03;

public class CovariantReturn {
	
	 CovariantReturn m1() {
		CovariantReturn ob = new CovariantReturn();
		System.out.println("Covariant Return type is calling here");
		return ob;
	}
	 
	 public static void main(String[] args) {
		B b = new B();
		b.m1();
	}

}

 class B extends CovariantReturn{
	 CovariantReturn m1() {
			B ob2 = new B();
			System.out.println("Covariant B Return type is calling here");
			return ob2;
		}
}