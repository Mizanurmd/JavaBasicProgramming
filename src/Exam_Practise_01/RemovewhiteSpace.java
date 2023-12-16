package Exam_Practise_01;

public class RemovewhiteSpace {
	public static void main(String[] args) {
		String st = " Java is very importtant language  ";

    String s = st.trim();
    String ss = st.replaceAll("\\s", "");
    
    
    System.out.println(s);
    System.out.println(ss);
		
		
	}

}
