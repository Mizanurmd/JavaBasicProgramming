package Exam_01_Sinleton;

public class LazyTest {
public static void main(String[] args) {
	LazySingleTon obj = LazySingleTon.createInstace();
	LazySingleTon obj2 = LazySingleTon.createInstace();
	
	if(obj == obj2) {
		System.out.println("Objects are the same.");
	}else {
		System.out.println("Not same");
	}
	
}
}
