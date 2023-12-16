package Exam_Practise_01;

public class SpecilaCharacter {
	public static void main(String[] args) {
		String st = "mizanur021991@gmail.com";
		char[]c=st.toCharArray();
		String r ="";
		for(int i =0; i<c.length; i++) {
			if(!Character.isLetter(c[i]) && !Character.isDigit(c[i])) {
				r = r + c[i];
			}
		}
		System.out.println(r);
		
	}

}
