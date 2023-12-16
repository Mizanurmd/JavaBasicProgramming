package Exam_LetCode_01;



public class LetCode_01 {
	public static void main(String[] args) {
		int[]nums = {2, 5,7,8,11};
		
		System.out.println(twoSum(nums, 9));
		
	}

	public static int[] twoSum(int[]nums, int terget) {
		
		for(int i =0; i<nums.length; i++) {
			
			for(int j =i; j<nums.length; j++) {
				if(nums[i]+ nums[j] == terget) {
					return new int[] {i,j};
				}
			}
		}
		return nums;
		
	}
	
}
