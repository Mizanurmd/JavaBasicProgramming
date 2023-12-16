package Exam_03Years;



public class FactorialNumber {
	public static void main(String[] args) {
		
		//=========== Using for loop here==============

		int f =1;
		for(int i =1; i<=5; i++) {
			f = f * i;
		}
		System.out.println("Factorial 5 of = "+f);
		
		System.out.println(fact(5));
		
	}
	
	
	
	//============ create a method for factorial===========//
	
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}else {
			return fact(n -1)*n;
		}
	}

}
