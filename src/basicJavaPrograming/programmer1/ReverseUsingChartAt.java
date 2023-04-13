package basicJavaPrograming.programmer1;

import java.util.Scanner;

public class ReverseUsingChartAt {
	public static void main(String[]args) {
		
//		String st = "Software";
		
		String st;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter your String here = ");
		st = n.nextLine();
		
		char[]chars = st.toCharArray();
		
		for(int i=chars.length-1; i >=0;  i--) {
			System.out.print(chars[i]);
		}
	}

}
