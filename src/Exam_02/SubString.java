package Exam_02;

public class SubString {
	public static void main(String[] args) {
		String st = "Mizanur";
		String st2="Rahman";
		String s = st.concat(st2);
		System.out.println(s);
		
		System.out.println(st.charAt(1));
		System.out.println(st.indexOf("n"));
		String c = "   Coding test here   ";
		String d ="Learn";
		System.out.println(c.trim());
		System.out.println(d.endsWith("n"));
		System.out.println(st.equals(st2));
		System.out.println(d.replace('L', 'R'));
	}

}
