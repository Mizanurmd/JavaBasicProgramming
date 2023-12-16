package Exam_StringDetails;

public class StringExample7 {
	public static void main(String[] args) {
		String s = "Java";
		String s1 = new String("java");
		
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("Equal");
			
		}else {
			System.out.println("Not equal");
		}
		
	}

}
