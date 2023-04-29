package basicJavaPrograming.programmer1;

import java.util.ArrayList;
import java.util.Iterator;

public class WhileForAdvanceForLoop {
	public static void main(String[]args) {
		//Q #10) Write a Java Program to iterate ArrayList using for-loop, 
		//while-loop, and advance for-loop.
		
		ArrayList list = new ArrayList<>();
		list.add(20);
		list.add(50);
		list.add(60);
		list.add(100);
		System.out.println("==============while loop =================");
		Iterator itera = list.iterator();
		while(itera.hasNext()) {
			System.out.print(itera.next()+",");
			
		}
		System.out.println("\n=============Advance for loop===============");
		for(Object obj : list) {
			System.out.print(obj +",");
		}
		
		System.out.println("\n============= For Loop ================");
		
		for(int i =0; i<list.size(); i++) {
			System.out.print(list.get(i)+",");
		}
	}

}
