package Exam_LetCode_01;

public class LetCode_8 {
	public static void main(String[] args) {
		// find out missing number
		int ar[] = new int[] { 1, 2, 3, 5, 4, 7, 8, 9, 10 };
		
		int actualSum =(10 * 11)/2;
		
		int sum =0;
		for(int i = 0; i<ar.length; i++) {
			sum = sum + ar[i];
			
		}
		System.out.println("Array missing sum = "+sum);
		int misNumber = actualSum -sum;
		System.out.println("Missing number of Array = "+ misNumber);
	}

}
