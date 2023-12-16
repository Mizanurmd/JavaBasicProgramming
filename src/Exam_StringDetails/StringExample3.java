package Exam_StringDetails;

public class StringExample3 {
	public static void main(String[] args) {
		String ta ="A";
		ta = ta.concat("B");//AB
		String tb ="C";
		ta = ta.concat(tb); //ABC
		ta.replace('C', 'D'); //ABD, but no reference variable here
		ta = ta.concat(tb); // ABCC
		
		System.out.println(ta);
	}

}
