package Exam_CodingTest_01;

import java.util.Scanner;

public class SentenceRevers {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter any Sentence here = ");
		String st =s.nextLine();
		String[]stt = st.split(" ");
		String revString ="";
		
		for(int i =stt.length-1; i>=0; i--) {
			revString = revString + stt[i]+" ";
		}
		System.out.println("Reverse sentence is = "+revString);
		
	}
	

}
