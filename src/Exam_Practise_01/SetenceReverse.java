package Exam_Practise_01;

public class SetenceReverse {
	public static void main(String[] args) {
		String st ="Java is very popular language";
		
		String[]rs =st.split("");
		String result ="";
		for(int i=rs.length-1; i>=0; i--) {
			result = result + rs[i];
		}
		System.out.println(result);
		
	}

}
