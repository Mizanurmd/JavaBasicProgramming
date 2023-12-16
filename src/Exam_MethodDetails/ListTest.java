package Exam_MethodDetails;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String>heores = new ArrayList<>(Arrays.asList("a","b", "c"));
//		heores.add(" Sea Bescuit ");
//		System.out.println(heores.get(0).trim());
		
		
		
		for(String s : heores) {
			if(s.equals("a")) {
				heores.remove(s);
			}
		}
		System.out.println(heores);
		
	}

}
