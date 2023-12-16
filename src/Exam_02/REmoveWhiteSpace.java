package Exam_02;

public class REmoveWhiteSpace {
	public static void main(String[] args) {
		
		String st = "I am Bangladeshi";
		String spaceRemove ="";
		////////// without in build function here 
		
		for(int i =0; i<st.length(); i++) {
			if(st.charAt(i)!=' ' && st.charAt(i) !='\t') {
				spaceRemove = spaceRemove + st.charAt(i);
			}
		}
		System.out.println(spaceRemove);
		
		//////// Using in build function/////
		//String st3 = st.replaceAll("\\s+", "");
		//System.out.println(st3);
	}

}
