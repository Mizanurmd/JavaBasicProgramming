package Exam_FactoryDesignPattern;

public class UPICardTransaction implements Payment{

	@Override
	public void transaction(float amount) {
		System.out.println("UPI Card transaction is initiated... Amount is = "+ amount);
		
	}

}
