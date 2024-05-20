package Exam_FactoryDesignPattern2;

public class TransactionType {
public static Payment getTransactionType(String type) {
		
		Payment payment = null;
		if(null != type) {
			switch (type) {
			case "Check":
				payment = new CheckTransaction();
				break;
			case "DebitCard":
				payment = new DebitCardTrasaction();
				break;
			case "CreditCard":
				payment = new CreditCardTransaction();
				break;
			case "UPICard":
				payment = new UPICardTransaction();
				break;

			default:
				break;
			}
			
		}
		
		
		
		return payment;
		
	}

}
