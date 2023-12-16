package Exam_05;

public class IntegerReverse {
	public static void main(String[] args) {
		int num = 52310;
		System.out.println(reverse(num));
	}

	/// Create a method here 
	
	public static int reverse(int input) {
		long rev = 0;
		while(input !=0) {
			rev =rev *10 + rev %10;
			input /=10;
			if(rev > Integer.MAX_VALUE || rev > Integer.MIN_VALUE) 
			{
				return input;
			}
		}
		return 0;
		
	}
	
}
