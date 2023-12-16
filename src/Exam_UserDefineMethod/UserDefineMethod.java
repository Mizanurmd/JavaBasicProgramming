package Exam_UserDefineMethod;

import java.util.Scanner;

public class UserDefineMethod {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number = ");
		int num =s.nextInt();
		evenOrOdd(num);
		
		//=============add=============
	
		
		System.out.println("A + b ="+add(55, 95) );
		
		
		
	}
	
	//========== Create a user define method here/////////
	public static void evenOrOdd(int num) {
		if(num%2== 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
	
	//=========== user Define add method =============
	public static int add(int a, int b) {
		
		int result= a + b;
		
		return result;
	}

}
