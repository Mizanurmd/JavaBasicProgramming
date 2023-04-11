package basicJavaPrograming.singleToneDesign;

public class LazySingleton {
	//////// Declare and create instance/////////
	private static LazySingleton instance = new LazySingleton();
	
	////////// Create constructor here ////////
	private LazySingleton() {
		System.out.println("Instance is created!!!!!!!!!!!");
	}
	
	/////////// Create object herer ////////////
	public static LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		
		
		return instance;
	}
	
	//////////////// Create a method for Message///////
	public void getMessage() {
		System.out.println("It is  a message");
	}

}
