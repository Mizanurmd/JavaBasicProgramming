package basicJavaPrograming.programmer1;

import java.util.Scanner;

public class FibonacciNumber {
	public static void main(String[]args) {
		int a =0, b =0, c = 1, num;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter your Fibonacci Number : ");
		num = n.nextInt();
		System.out.println("=============Fibonacci Number are ================");
		for(int i = 0; i<num; i++) {
			a = b;
			b = c;
			c = a + b;
			
			System.out.print(a +",");
		}
		
		
	}

}
