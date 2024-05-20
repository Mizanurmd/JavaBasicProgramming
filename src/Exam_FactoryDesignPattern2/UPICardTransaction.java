package Exam_FactoryDesignPattern2;

public class UPICardTransaction implements Payment{

	@Override
	public void transaction(double amount) {
		System.out.println("Transaction is initiated by UPI Card Amount: "+ amount);
		
	}

}
