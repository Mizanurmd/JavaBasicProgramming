package Exam_LetCode_01;



public class LetCode_7 {
	public static void main(String[] args) {
		
		int[]a = {1,2,3,5,6,10,70,80,5,2,3};
		
		int tergate = 80;
		
		for( int i =0; i<a.length; i++) {
			if(a[i] == tergate) {
				System.out.println("Tergat number index = "+ i);
				return;
			}
		}
		
			System.out.println("Tergat number index is not found !!!");
		
		
	}

}
