package basicJavaPrograming.programmer1;

import java.util.HashMap;

public class CountNumber {
	
	public static void main(String[]args) {
		////Q #5) Write a Java Program to count the number of words in a string using HashMap.
		String st = "This this is is done by Saket Saket";
		int c;
		String[]spl = st.split(" ");
		HashMap<String, Integer>map = new HashMap<>();
		for(int i=0; i<spl.length; i++) {
			if(map.containsKey(spl[i])) {
				c =map.get(spl[i]);
				map.put(spl[i], c+1);
			}else {
				map.put(spl[i], 1);
			}
		}
		System.out.println(map);
		
	}

}
