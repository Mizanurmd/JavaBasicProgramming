package basicJavaPrograming.singleToneDesign;

public class LazyTest {
	public static void main(String[]args) {
		
		//////////// Create thread////////
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				LazySingleton ob = LazySingleton.getInstance();
				ob.getMessage();
			}
		});
		
		///////////// Create thread two////////////
		Thread tt = new Thread(new Runnable() {
			
			@Override
			public void run() {
				LazySingleton ob = LazySingleton.getInstance();
				ob.getMessage();
				
			}
		});
		
		/////////////// Thread Call here////////
		t.start();
		tt.start();
	
	}

}
