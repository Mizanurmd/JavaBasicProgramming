package Exam_02;

import java.util.Scanner;

public class Function {
	
	public static int calculate(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of A = ");
		int a = s.nextInt();
		System.out.println("Enter the value of B = ");
		int b = s.nextInt();
		int sum = calculate(a, b);
		System.out.println("Total sum = "+ sum);
	}
	
}
