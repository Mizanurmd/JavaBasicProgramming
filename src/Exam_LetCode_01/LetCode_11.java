package Exam_LetCode_01;

import java.util.Scanner;

public class LetCode_11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any integer number here = ");
		int n =s.nextInt();
		
		int fact =1;
		for(int i =n; i>1; i--) {
			fact = fact *i;
		}
		
		System.out.println("Factorial of 5 = "+ fact);
		
	}

	/// Create a method for Factorial number
	
	
	
}
