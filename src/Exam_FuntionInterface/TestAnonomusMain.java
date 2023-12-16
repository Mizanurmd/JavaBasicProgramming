package Exam_FuntionInterface;

public class TestAnonomusMain {
	public static void main(String[] args) {
		
		Bird b = new Bird() {
			
			@Override
			public void canFly() {
				System.out.println("Bird can fly in the sky");
				
			}
		};
		
		b.canFly();
	}

}
