package Exam_MethodDetails;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class Direction {
	public static void main(String[] args) {
		
		Map<String, Integer>map = new HashMap<>();
		map.put("Guitar", 1250);
		map.put("Cello", 3000);
		map.put("Dum", 2000);
		map.put("Tar", 2000);
		
		System.out.println(map.size());
		
		
		System.out.println(map.size());
		System.out.println(map);
		//==================ADvance for loop =============
		for(Map.Entry m :map.entrySet()) {
			System.out.println(m.getKey() +" : "+ m.getValue());
		}
		//============= sorting============
		System.out.println("=============Asccending Sorted map====================");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
		
		//============= sorting============
				System.out.println("=============Descending Sorted map====================");
				map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(System.out::println);
		
	}

}
