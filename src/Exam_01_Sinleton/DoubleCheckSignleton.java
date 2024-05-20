package Exam_01_Sinleton;

public class DoubleCheckSignleton {
	// Declare variable
	private static DoubleCheckSignleton instance;
	
	// Create a private Constructor
	private DoubleCheckSignleton() {
		System.out.println("Double Check Singleton Constructor.");
	}
	
	// Create a static factory Method
	public static synchronized DoubleCheckSignleton getInstance() {
		if(instance == null) {
			synchronized (DoubleCheckSignleton.class) {
				if(instance == null) {
					instance = new DoubleCheckSignleton();
				}
				
			}
			
		}
		
		return instance;
	}

}
