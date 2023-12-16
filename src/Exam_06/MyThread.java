package Exam_06;

public class MyThread extends Thread{
	
	public void run() {
		try {
			Thread.sleep(1000);
			for(int i= 0; i<5; i++) {
				System.out.println("i: "+ i);
			}
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		System.out.println("Hello world");
	}

}
