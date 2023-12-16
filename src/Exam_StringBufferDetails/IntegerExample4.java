package Exam_StringBufferDetails;

public class IntegerExample4 {
	public static void main(String[] args) {
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		Integer c = 10;
		
		System.out.println(a == b); //false
		System.out.println(a == c); //false
		System.out.println(a.equals(b)); //true
		
	}

}
