package Exam_StringDetails;

public class StringTwo {
	public static void main(String[] args) {
		String s = new String("Mizan");
		s.concat("Rahman");// no reference variable here
		s = s.concat("Sinha");
		System.out.println(s);//MizanSinha
		
	}

}
