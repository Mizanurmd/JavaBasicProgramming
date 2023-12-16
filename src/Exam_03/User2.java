package Exam_03;

public interface User2 {
	public static final String name = "XYZ";
	
	void insertCard();
	void enterCard();
	// create default method here
	default void printMes() {
		System.out.println("Welcome User");
		processData();
		printBankStatement();
		System.out.println("Thank You.");
	}
	// Create static method here
	static void selectLanguage() {
		System.out.println("Select your language.");
	}
	
	//// Create private method here
	private void processData() {
		System.out.println("Collect cash.");
	}
	
	private static void printBankStatement() {
		System.out.println("Print bank statement");
	}

}
