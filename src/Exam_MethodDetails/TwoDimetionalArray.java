package Exam_MethodDetails;

import java.util.Scanner;

public class TwoDimetionalArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row number of Array = ");
		int row = s.nextInt();
		System.out.println("Enter the column number of Array = ");
		int col = s.nextInt();
		
		int[][]nums = new int[row][col];
		
		
		//=============input from user=========
		//row
		for(int i =0; i<row; i++) {
			// column
			for(int k = 0; k<col; k++) {
				nums[i][k]=s.nextInt();
			}
		}
		// out put
		for(int i =0; i<row; i++) {
			// column
			for(int k = 0; k<col; k++) {
				System.out.print(nums[i][k]+" ");
			}
			System.out.println();
		}
		
	}

}
