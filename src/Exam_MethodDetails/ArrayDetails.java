package Exam_MethodDetails;


import java.util.Arrays;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

public class ArrayDetails {
	public static void main(String[] args) {
		List<Integer>list = Arrays.asList(1,6,35,8,9,6,2,8,10);
		System.out.println(list);
		Set<Integer>s = new HashSet<>();
		Set<Integer>ss = new HashSet<>();
		
		
		for(Integer orS :list) {
			if(!s.add(orS)) {
				ss.add(orS);
			}
			
		}
		System.out.println(s);
		System.out.println(ss);
		
	}

}
