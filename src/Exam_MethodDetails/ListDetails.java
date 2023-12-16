package Exam_MethodDetails;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDetails {
public static void main(String[] args) {
	List<String>theList =new ArrayList<>();
	theList.add("One");
	theList.add("Two");
	theList.add("Three");
	theList.add("Four");
	theList.add("Five");
	System.out.println("=============One=================");
	for(int i=0; i<theList.size(); i++) {
		System.out.println(theList.get(i));
	}

	System.out.println("===========Two====================");
	//============One way print list==========//
	theList.forEach(System.out::println);
	//============One two way print list==========//

	Iterator it = theList.iterator();
	System.out.println("===========Three====================");
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("=============Four=================");
	for(Object ob:theList) {
		System.out.println(ob);
	}
	
}
}
