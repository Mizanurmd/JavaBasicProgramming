package Exam_FactoryDesignPattern;

public class MainClass {
	public static void main(String[] args) {
		TransactionFactory trasactionFact = new TransactionFactory();
		Payment p= trasactionFact.getTransactionType("Check");
		p.transaction(1000);
		Payment p2= trasactionFact.getTransactionType("DebitCard");
		p2.transaction(5000);
	}

}
