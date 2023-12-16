package Exam_CodingTest_01;

import java.util.Arrays;

public class RemoveElementOfArrary {
	public static void main(String[] args) {
		int[]orArray = {1,2,3,4,5};
		
		int removeElement =4;
		System.out.println("Orginal Array = "+ Arrays.toString(orArray));
		
		int[] testArray= remove(orArray, removeElement);
		System.out.println("Testing Array=========="+ Arrays.toString(testArray));
	}
	
	/// create  a method here//
	public static int[]remove(int[]array, int elements){
		int[]newArray = new int[array.length-1];
		int c =0;
		
		for(int i =0; i<array.length; i++) {
			if(array[i] != elements) {
				newArray[c] = array[i];
				c++;
			}
		}
		return newArray;
		
	}

}
