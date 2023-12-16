package Exam_Practise_01;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[]num = {10,20,3,60,90,41,50,70,90,550,60,880};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		int t =90;
		int l =0, r = num.length-1, mid;
		
		
		
		while(l < r) {
			mid = (l+r)/2;
			if(num[mid] == t) {
				System.out.println("Index found = "+ mid);
				return;
			}else if(num[mid] < t) {
				l = mid +1;
			}else {
				r = mid -1;
			}
			
		}
		
		
		
	}

}
