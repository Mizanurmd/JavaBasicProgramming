package Exam_03Years;

public class Factorial {
	public static void main(String[] args) {
		int a =5;
		int fac = 1;
		for(int i =1; i<=a; i++) {
			fac =  fac * i;
		}
		System.out.println("Factorial "+a +" of = "+ fac);
		System.out.println(factorialNumber(5));
	}
	
	public static int factorialNumber(int a) {
		if(a == 0) {
			return 1;
		}else {
			return factorialNumber(a -1)* a;
		}
	}

}
