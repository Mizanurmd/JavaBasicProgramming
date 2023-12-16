package Exam_02;

public class CountSpace {
	public static void main(String[] args) {
		String st = " This is a Bangladesh ";
		char[]ch = st.toCharArray();
		int c=0;
		
		for(int i =0; i<ch.length; i++) {
			if(ch[i]==' ') {
				c++;
			}
			
		}
		System.out.println("Space count = "+ c);
	}


}
