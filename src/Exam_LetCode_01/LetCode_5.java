package Exam_LetCode_01;

import java.util.Scanner;

public class LetCode_5 {
	public static void main(String[] args) {
	
		/*
		 * int num, a =0, b =0, c =1; Scanner s = new Scanner(System.in);
		 * System.out.println("Enter the fibonacci series = "); num = s.nextInt();
		 * 
		 * for(int i= 0; i <num; i++) { a = b; b =c ; c = a + b; System.out.print(a +
		 * ","); }
		 * 
		 */
		
		// Calling method here 
		
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the series of fibonacci = ");
		num = s.nextInt();
		fibo(num);
		
		
	}
	
	// Create a method  for  fibonacci series
	
	public static void fibo(int x) {
		int a =0, b =0, c = 1;
		for(int i =0; i<x; i++) {
			a = b ;
			b = c ;
			c = a + b;
			System.out.print(a + ",");
		}
	}
	
}
