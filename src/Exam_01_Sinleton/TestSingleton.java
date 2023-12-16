package Exam_01_Sinleton;

public class TestSingleton {
	public static void main(String[] args) {
		EarlySingleTon obj = EarlySingleTon.getInstance();
		EarlySingleTon obj2 = EarlySingleTon.getInstance();
		
		if(obj ==obj2) {
			System.out.println("Objects are same.");
		}else {
			System.out.println("Objects are not same.");
		}
		
	}

}
