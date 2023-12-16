package Exam_Thread;

public class A extends Thread {
	
		public void run() {
			for(int i =10; i>=0; i--) {
				System.out.println("i: ="+i);
				
				try {
					sleep(500);
				} catch (Exception e) {
					
				}
				
			}
		
		}

}
