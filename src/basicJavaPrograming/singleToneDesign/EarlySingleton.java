package basicJavaPrograming.singleToneDesign;

public class EarlySingleton {
	//////// Declare and create instance/////////
	private static EarlySingleton instance = new EarlySingleton();
	
	////////// Create constructor here ////////
	private EarlySingleton() {
		System.out.println("Instance is created!!!!!!!!!!!");
	}
	
	/////////// Create object herer ////////////
	public static EarlySingleton getInstance() {
		if(instance == null) {
			instance = new EarlySingleton();
		}
		
		
		return instance;
	}
	
	//////////////// Create a method for Message///////
	public void getMessage() {
		System.out.println("It is  a message");
	}

}
