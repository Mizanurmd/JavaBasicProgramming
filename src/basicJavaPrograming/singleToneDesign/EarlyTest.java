package basicJavaPrograming.singleToneDesign;

public class EarlyTest {
	public static void main(String[]args) {
		
		EarlySingleton ob = EarlySingleton.getInstance();
		ob.getMessage(); 
		EarlySingleton ob2 = EarlySingleton.getInstance();
		if(ob==ob2) {
			System.out.println("It is true");
		}else {
			System.out.println("It is false");
		}
	}

}
