package Exam_FactoryDesignPattern;

public class TransactionFactory {
	
	Payment getTransactionType(String transactionType) {
		Payment pay = null;
		if(null !=transactionType) {
			switch (transactionType) {
			case "Check":
				pay = new CheckTransaction();
				break;
			case "DebitCard":
				pay = new CheckTransaction();
				break;
			case "CreditCard":
				pay = new CheckTransaction();
				break;
			case "UPICard":
				pay = new CheckTransaction();
				break;

			default:
				break;
			}
			
			
		}
		return pay;
		
		
	
	}

}
	
