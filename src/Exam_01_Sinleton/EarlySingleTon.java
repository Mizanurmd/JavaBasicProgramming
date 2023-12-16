package Exam_01_Sinleton;

public class EarlySingleTon {
	
	private static EarlySingleTon instance = new EarlySingleTon();
	
	private EarlySingleTon() {
		System.out.println("EarlySingleTon Constructor is created.");
	}
	// Create a method
	public static EarlySingleTon getInstance() {
		if(instance == null) {
			instance = new EarlySingleTon();
		}
		return instance;
	}

}
