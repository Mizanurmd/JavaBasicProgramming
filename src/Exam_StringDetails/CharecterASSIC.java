package Exam_StringDetails;

public class CharecterASSIC {
	public static void main(String[] args) {
		String name = "It is simple";
		int sum =0;
		String[]st = name.split("");
		String r ="";
		
		for(int i =name.length()-1; i>=0; i--) {
			char c  = name.charAt(i);
			r = r + name.charAt(i);
			System.out.println(c +" = "+(int)c);
			sum = sum + (int)c;
		}
		System.out.println("Sum of ASSCI value of this = "+ sum);
		System.out.println("Reverse of this = "+ r);
		
		
	}

}
