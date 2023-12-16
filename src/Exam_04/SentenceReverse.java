package Exam_04;

import java.util.Scanner;

public class SentenceReverse {
	public static void main(String[] args) {
		
		String st;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String sentence here = ");
		st = sc.nextLine();
		System.out.println(st);
		
		String[]st2 =st.split(" ");
		String res ="";
		for(int i=st2.length-1; i>=0; i--) {
			res = res + st2[i]+" ";
		}
		System.out.println("Resverse = "+ res);
		
	}

}
