package basicJavaPrograming.programmer1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorHashMap {

	public static void main(String[]args) {
		
		///Q #6) Write a Java Program to iterate HashMap using While and advance for loop.
		HashMap<Integer, String>map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "KIWI");
		map.put(4, "Water-Milon");
		System.out.println("=========== Iterator HashMap with while loop=============");
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry st = (Map.Entry)itr.next();
			System.out.println("Key is = "+st.getKey()+ " Value is = "+ st.getValue());
		}
		System.out.println("=============Using Advance For Loop here==================");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println("Key is = "+m.getKey()+ " Value is = "+ m.getValue());
		}
	}
	
}
