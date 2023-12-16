package Exam_CodingTest_01;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
	public static void main(String[] args) {
		
		String st ="sandeep";
		Set<Character>s = new HashSet<>();
		
		char[]c = st.toCharArray();
		for(int i =0; i<c.length;i++) {
			 s.add(c[i]);
			
			
		}
		
			System.out.println(s);
		
	}

}
