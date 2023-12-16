package Exam_06;

public class Condition {

	public static void main(String[] args) {

		for (int i = 3; i < 20; i++) {
			System.out.println(i % 3);
			if(i%2 ==0) {
				i++;
				
			}else if(i% 3 ==2) {
				i +=2;
			}
			System.out.println("i: "+ i);
			
		}
	}

}
