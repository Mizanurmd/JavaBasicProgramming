package Exam_MethodDetails;



public class TwoArray {
	public static void main(String[] args) {
		
		int[][]nums = {{8,9},{4,5},{2,3}};
		
		// row
		for(int i =0; i<nums.length; i++) {
			// column
			for(int j =0; j<nums[0].length; j++) {
				System.out.print(nums[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

}
