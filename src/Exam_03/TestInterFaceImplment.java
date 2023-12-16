package Exam_03;

public class TestInterFaceImplment implements User2{

	@Override
	public void insertCard() {
		System.out.println("Please, Enter your card.");
		
	}

	@Override
	public void enterCard() {
		System.out.println("Please, Enter your PIN number.");
		
	}

}
