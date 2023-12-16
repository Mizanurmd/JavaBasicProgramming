package Exam_02;

import java.util.Scanner;

public class Function2 {
	
	public static String namePrint(String fname, String lname) {
		String fullName = fname +" "+ lname;
		return fullName;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name = ");
		String fname = sc.nextLine();
		System.out.println("Enter the last name = ");
		String lname = sc.nextLine();
		
		String fullName = namePrint(fname, lname);
		
		System.out.println("My full name is = "+ fullName);
		
	}

}
