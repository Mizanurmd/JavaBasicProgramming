package Exam_Practise_01;

public class LinearSearch {
	public static void main(String[] args) {
		
		int[]num = {10,20,3,60,90,41,50,70,90,550,60,880};
		
		int t = 550;
		
		for(int i =0; i<num.length; i++) {
			if(num[i] == t) {
				System.out.println("index founded = "+ i);
				return;
			}
			
		}
		System.out.println("Not founded!!!");
		
		
		
		
	}

}
