package Exam_StreapDetails;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StremOne {
	public static void main(String[] args) {
		
		List<Integer>num = Arrays.asList(1,10,2,15,20,3,4,5,6,7,8,9);
		// Sort
		List<Integer>sortedNumer= num.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List = "+ sortedNumer);
		System.out.println("=======================================");
		// create Stream
		num.stream().filter(e->e > 3).map(n -> n*n).forEach(s->System.out.println(s));
		//=== another way==========//
		System.out.println("============================================");
		List<Integer> tl= num.stream().filter(e -> e <= 3).map(n -> n*n).collect(Collectors.toList());
		System.out.println(tl);
		System.out.println("============================================");
		List<Integer> tl2= num.stream().filter(e -> e %2 == 0).map(n -> n*n).collect(Collectors.toList());
		System.out.println(tl2);
		
	}

}
