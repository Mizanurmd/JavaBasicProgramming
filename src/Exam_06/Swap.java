package Exam_06;

public class Swap {
	public static void main(String[] args) {
		
		int a =500;
		int b =600;
		System.out.println("Before Swap A ="+a +"  and B = "+ b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After  Swap A ="+a +"  and B = "+ b);
		
	}

}
