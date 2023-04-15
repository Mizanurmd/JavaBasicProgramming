package basicJavaPrograming.programmer1;

import java.util.Scanner;

public class SwapTwoNumber {
	public static void main(String[] args) {
		
		int a, b;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the first Swap Number = ");
		a = n.nextInt();
		System.out.println("Enter the second sewap number = ");
		b = n.nextInt();
		
		System.out.println("==============Before Swap Number ====================");
		System.out.println("Value of A = " + a + "\nValue of B = " + b);

		System.out.println("===============After Swap Number==================");
		a = a + b;
		b= a - b;
		a = a - b;
		System.out.println("Value of A = " + a + "\nValue of B = " + b);
	}

}
