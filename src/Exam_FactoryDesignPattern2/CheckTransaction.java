package Exam_FactoryDesignPattern2;

public class CheckTransaction implements Payment{

	@Override
	public void transaction(double amount) {
		System.out.println("Transaction is initiated by Check Amount: "+ amount);
		
	}

}
