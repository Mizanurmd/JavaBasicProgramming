package Exam_03Years;

public class ArrayPrint {
	public static void main(String[] args) {
		int[][] a = { { 4, 6 }, { 8, 5, 6, 10 }, { 20, 60, 40, 90 } };

		/*
		 * for (int i = 0; i < a.length; i++) { for (int j = 0; j < a[i].length; j++) {
		 * System.out.println(a[i][j]); } }
		 */
		
		//========== print another way
		
		for(int[] is : a) {
			for(int b: is) {
				System.out.println(b);
				
			}
		}
		
	}

}
