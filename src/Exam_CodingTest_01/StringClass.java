package Exam_CodingTest_01;

public class StringClass {
	public static void main(String[] args) {
		
		String st ="ABC";
		String st1 ="ABC";
		String st2 = new String("ABC");
		String st3 = new String("aBC");
		
		System.out.println(st ==st1);
		System.out.println(st ==st2);
		System.out.println(st.equals(st2));
		System.out.println(st.equals(st3));
		System.out.println(st.equalsIgnoreCase(st2));
		
		
	}

}
