package Exam_04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateValueOfArray {
	public static void main(String[] args) {
		int[]num = {10,20,5,4,8,10,5,6,90,8,20};
		Arrays.sort(num);
		System.out.println("0 Array Number is "+ Arrays.toString(num));
		
		Set<Integer>orgVal = new HashSet<>();
		Set<Integer>dupVal = new HashSet<>();
		
		for(Integer or : num) {
			if(!orgVal.add(or)) {
				dupVal.add(or);
			}
			
		}
		System.out.println("Orginal Value = "+orgVal);
		System.out.println("Dupicate Value"+orgVal);
		
	}

}
