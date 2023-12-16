package Exam_Practise_01;

import java.util.HashSet;
import java.util.Set;

public class FindOutDuplicateValue {
	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5,6,7,2,3,4,10};
		
		
		Set<Integer>uVal = new HashSet<>();
		Set<Integer>dVal = new HashSet<>();
		
		
		for(int v : arr) {
			if(!uVal.add(v)){
				dVal.add(v);
			}
			
			
		}
		
		System.out.println(uVal);
		System.out.println(dVal);
		
	}

}
