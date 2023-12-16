package Exam_FactoryDesignPattern;

public class CheckTransaction implements Payment {

	@Override
	public void transaction(float amount) {
		System.out.println("Check transaction is initiated... Amount is = "+ amount);
		
	}

}
