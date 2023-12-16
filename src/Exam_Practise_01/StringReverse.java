package Exam_Practise_01;

public class StringReverse {
	public static void main(String[] args) {
		String name="Mizanur";
		
		//==========Approach-01==========
		char[]c = name.toCharArray();
		for(int i =c.length-1; i>=0; i--) {
			System.out.print(c[i]);
		}
		//==========Approach-02==========
		System.out.println("\n=======================");
		for(int i =name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}
		//==========Approach-03==========
				System.out.println("\n=======================");
		StringBuffer sb = new StringBuffer(name);
		System.out.println(sb.reverse());
		//==========Approach-03==========
		System.out.println("\n=======================");
		StringBuilder sbd = new StringBuilder(name);
		System.out.println(sbd.reverse());
		
	}
	

}
