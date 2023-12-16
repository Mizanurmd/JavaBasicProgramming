package Exam_LamadaDetails;

public class Test {
	int x =10;
	
	public void m2() {
		int y = 25;
		
		// lamda expression
		Interf l =()->{
			System.out.println(x);
			System.out.println(y);
		};
		l.m1();
		
	}

}
