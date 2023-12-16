package Exam_FactoryDesignPattern;

public class CreditCardTransaction implements Payment{

	@Override
	public void transaction(float amount) {
		System.out.println("Credit Card transaction is initiated... Amount is = "+ amount);
		
	}

}
