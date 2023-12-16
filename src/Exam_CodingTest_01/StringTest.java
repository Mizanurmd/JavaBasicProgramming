package Exam_CodingTest_01;

public class StringTest {
	public static void main(String[] args) {
		
		String st ="mizanur021991@ gmail.com";
		char[]c = st.toCharArray();
		String stt ="";
		for(int i =0; i<c.length; i++) {
			if(Character.isLetterOrDigit(c[i])|| !Character.isWhitespace(c[i])) {
				System.out.print(c[i]);
			}
		}
		
		
	}

}
