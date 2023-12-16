package Exam_StringDetails;

public class FinalVsImmutable {
	public static void main(String[] args) {
		String s = new String("mizan");//immutable
		 s.concat("developer");
		//s = s.concat("developer");
		
	final StringBuffer sb = new StringBuffer("mizanur"); // not immutable
	sb.append("software");
	//sb = sb.append("task"); // because it is final not asign more 
	System.out.println(s);
	System.out.println(sb);
	}

}
