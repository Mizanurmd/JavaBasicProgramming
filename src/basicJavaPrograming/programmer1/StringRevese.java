package basicJavaPrograming.programmer1;

import java.util.Scanner;

public class StringRevese {
	public static void main(String[]args) {
		
		String st;
		Scanner n  = new Scanner(System.in);
		System.out.println("Enter String here = ");
		st = n.nextLine();
		StringBuilder st2 = new StringBuilder();
		 st2.append(st);
		 st2 = st2.reverse();
		System.out.println(st2);
		
		
	}

}
