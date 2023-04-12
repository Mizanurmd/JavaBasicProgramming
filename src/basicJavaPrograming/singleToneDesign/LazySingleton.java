package basicJavaPrograming.singleToneDesign;

public class LazySingleton {
	////////////// Declare instance but not created/////////
	private static LazySingleton instance;
	
	private LazySingleton() {
		System.out.println("Created instance!!!!!!!!!!!");
	}

	//// This method is created for creating instance///////////
	
	public static synchronized LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	
	///////// Testing Message//////////////
	
	public void getMessage() {
		System.out.println("It is testing message");
	}
	
}
