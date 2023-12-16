package Exam_LetCode_01;


import java.util.Arrays;
import java.util.List;

public class LetCode_6 {
	public static void main(String[] args) {
		List<Integer>l =Arrays.asList(1,2,3,4,5,6,70);
		
		for(int i =0; i<l.size(); i++) {
			if(i%2 ==0) {
				System.out.println("Even Number = "+ i);
			}else {
				System.out.println("Odd Number = "+ i);
			}
		}
	
	}

	// Create a method for list
	
	
}
