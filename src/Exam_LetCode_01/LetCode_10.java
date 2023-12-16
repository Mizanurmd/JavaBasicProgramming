package Exam_LetCode_01;

import java.util.Arrays;

public class LetCode_10 {
	public static void main(String[] args) {
		int []nums = {10,20,30,4,0,1,6,40,80,500,70,100};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		int terget = 500;
		int l =0, r= nums.length-1, mid;
		
		while(l < r) {
			mid =(l + r)/2;
			
			if(nums[mid] == terget) {
				System.out.println("terget index = "+ mid);
				return;
			}else if(nums[mid] < terget) {
				l = mid+1;
			}else {
				r = mid -1;
			}
			
		}
		
		
	}

}
