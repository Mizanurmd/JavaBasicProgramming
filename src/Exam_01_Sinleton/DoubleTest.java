package Exam_01_Sinleton;

public class DoubleTest {
	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				DoubleCheckSignleton obj = DoubleCheckSignleton.getInstance();

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				DoubleCheckSignleton obj2 = DoubleCheckSignleton.getInstance();

			}
		});
		t.start();
		t2.start();

	}

}
