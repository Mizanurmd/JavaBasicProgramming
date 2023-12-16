package Exam_03Years;

public class Swap {
	public static void main(String[] args) {
		name(10,20);
	}
	public static int name(int a, int b) {
		
		
		System.out.println("Before swap A = "+ a +" B = "+b );
		a = a + b;
		b = a -b;
		a = a - b;
		System.out.println("After swap A = "+ a +" B = "+b );
		return a;
		
	}

}
