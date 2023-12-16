package Exam_StringDetails;

public class StringOne {
	public static void main(String[] args) {
		String s1 = new String("Spring");
		s1.concat("Fall");// no reference variable
		
		String s2 = s1.concat("Winter");
		s2.concat("Summer");// no reference variable
		
		System.out.println(s1);// Sprint
		System.out.println(s2);// SprintWinter
	}

}
