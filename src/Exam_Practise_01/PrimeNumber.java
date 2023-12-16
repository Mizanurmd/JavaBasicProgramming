package Exam_Practise_01;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int num, temp;
		boolean isPrime = true;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Integer number here = ");
		num = s.nextInt();
		
		
		for(int i =2; i<= num/2; i++) {
			temp = num%i;
			if(temp == 0) {
				isPrime= false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");
		}
		
	}

}
