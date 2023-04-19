package basicJavaPrograming.programmer1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWhileForLoop {
	public static void main(String[]args) {
		 ArrayList list = new ArrayList();
		 list.add("Mizanur Rahman");
		 list.add("Software");
		 list.add("Developer");
		 list.add(2);
		 
		 System.out.println("================Using while Iterator While loop===========");
		 
		 Iterator iter = list.iterator();
		 
		 while(iter.hasNext()) {
			 System.out.print(iter.next()+",");
		 }
		 
		 System.out.println("\n=================== Advance For Loop =================");
		 
		 for(Object ob : list) {
			 System.out.print(ob+",");
		 }
		 
		 System.out.println("\n================== Normal for Loop ======================");
		 
		 for(int i =0; i<list.size(); i++) {
			 System.out.print(list.get(i)+",");
		 }
		 
		 
		 
	}

}
