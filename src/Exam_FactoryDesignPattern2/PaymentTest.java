package Exam_FactoryDesignPattern2;

import java.util.Scanner;

public class PaymentTest {
	public static void main(String[] args) {
		//TransactionType tf = new TransactionType();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Transactin Type: ");
		
		Payment p = TransactionType.getTransactionType(s.nextLine());
		
		System.out.println("Enter the Transactin Amount: ");
		p.transaction(s.nextInt());
		
	}

}
