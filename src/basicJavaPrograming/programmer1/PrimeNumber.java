package basicJavaPrograming.programmer1;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[]args) {
		///Q #7) Write a Java Program to find whether a number is prime or not.
		int num, temp;
		boolean isPrime = true;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter any Integer Number = ");
		num = n.nextInt();
		for(int i = 2; i < num/2; i++) {
			temp = num%i;
			
			if(temp==0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is not prime");
		}
	}

}
