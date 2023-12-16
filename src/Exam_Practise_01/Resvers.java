package Exam_Practise_01;

public class Resvers {
	public static void main(String[] args) {
		
		String st ="NOON";
		char[]c = st.toCharArray();
		String r ="";
		for(int i =c.length-1; i>=0; i--) {
			r = r + c[i];
		}
		System.out.println(r);
		if(r.equals(st)) {
			System.out.println("Palimdrom");
		}else {
			System.out.println("Not Plaindrom");
			
		}
	}
	

}
