package Exam_Practise_01;

public class FactorialNumber {
	public static void main(String[] args) {
		System.out.println(fact(5));
	}
//Create a method for factorial 
	public static long fact(long n) {
		if(n==1) {
			return 1;
		}else {
			return (n*fact(n-1));
		}
	}
	
}
