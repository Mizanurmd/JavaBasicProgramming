package Exam_LetCode_01;

import java.util.Scanner;

public class LetCode_09 {
	public static void main(String[] args) {
		int[] num = { 100, 14, 46, 47, 94, 94,500, 52, 86, 36, 94, 89 };
		
		int hig=0, sechig =0;
		
		for(int i =0; i<num.length; i++) {
			if(num[i] > hig) {
				sechig = hig;
				hig = num[i];
				
			}else if(num[i] >sechig){
				sechig = num[i];
			}
		}
		
		System.out.println("Highest number is = "+ hig);
		System.out.println("Second Highest number is = "+ sechig);
	}

}
