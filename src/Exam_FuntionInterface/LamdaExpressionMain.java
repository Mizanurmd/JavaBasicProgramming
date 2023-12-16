package Exam_FuntionInterface;

public class LamdaExpressionMain {
	public static void main(String[] args) {
		
		Bird bl = ()->{
			System.out.println("Bird interface is implemetation using the lamda funtion");
		};
		
		bl.canFly();
	}

}
