package Exam_03Years;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorArrayList {
	public static void main(String[] args) {
		
		List<String>name = new ArrayList<>();
		name.add("Mizanur");
		name.add("Sizan");
		name.add("Rahman");
		name.add("Mamun");
		
		//================ use Iterator============
		Iterator it = name.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//================ use advance for loop===============
		System.out.println("===========advance for loop==============");
		for(String s : name) {
			System.out.println(s);
		}
		
		
	}

}
