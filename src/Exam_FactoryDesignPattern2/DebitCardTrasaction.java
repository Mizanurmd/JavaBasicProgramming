package Exam_FactoryDesignPattern2;

public class DebitCardTrasaction implements Payment {

	@Override
	public void transaction(double amount) {
		System.out.println("Transaction is initiated by Debit Card Amount: "+ amount);
		
	}

}
