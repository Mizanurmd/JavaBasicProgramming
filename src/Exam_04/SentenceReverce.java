package Exam_04;

public class SentenceReverce {
	public static void main(String[] args) {
		
		String st = "java Coding is very Easy";
		System.out.println(st);
		
		String[]st2 =st.split(" ");
		String res = "";
		for(int  i=st2.length-1; i>=0; i--) {
			res =res+ st2[i]+" ";
		}
		System.out.println("Sentence reverse is = "+ res);
		
		
		
	}
	


}
