package Exam_01_Sinleton;

public class LazySingleTon {
	private static LazySingleTon instance;
	
	private LazySingleTon() {
		System.out.println("Lazy Singleton constructor is created.");
	}
	
	//// create a method;
	public static LazySingleTon createInstace() {
		if(instance == null) {
			instance = new LazySingleTon();
		}
		return instance;
	}

}
