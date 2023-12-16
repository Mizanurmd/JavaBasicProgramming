package Exam_FactoryDesignPattern;

public class DebitCardTransaction implements Payment {

	@Override
	public void transaction(float amount) {
		System.out.println("Debit Card transaction is initiated... Amount is = "+ amount);
		
	}

}
