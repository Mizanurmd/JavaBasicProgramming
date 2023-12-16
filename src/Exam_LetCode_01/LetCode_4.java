package Exam_LetCode_01;

import java.util.Scanner;

public class LetCode_4 {
	public static void main(String[] args) {

		int num, temp;
		boolean isPrime = true;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any integer numbere here = ");
		num = s.nextInt();
		for(int i =2; i<num/2; i++) {
			temp = num %i;
			if(temp == 0) {
				isPrime = false;
				break;
			}
			
		}
		if(isPrime) {
			System.out.println("Prime");
		}else {
			System.out.println("not Prime");
		}
		
	}
	
}
