package Exam_03Years;

public class LinearSearch {
	public static void main(String[] args) {
		int[]nums = {5,6,8,11,4,13};
		int tergat =11;
		
		for(int i =0; i<nums.length; i++) {
			if(nums[i]== tergat) {
				System.out.println("Tergat number index is found = "+ i);
				return;
			}
		}
	
		//=============== linear Search using method here==========//
		/*
		 * if(tergat != -1) System.out.println("Tegat number index is founded ="+
		 * linear(nums, tergat)); else
		 * System.out.println("Tergat number is not founded !!!");
		 */
	}
	
	public static int linear(int[]nums, int tergat) {
		for(int i =0; i<nums.length; i++) {
			if(nums[i]== tergat)
				return i;
		}
		
		return -1;
	}

}
