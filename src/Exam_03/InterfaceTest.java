package Exam_03;

public class InterfaceTest {
	public static void main(String[] args) {
		TestInterFaceImplment t = new TestInterFaceImplment();
		System.out.println("Company name is "+t.name);
		t.insertCard();
		t.enterCard();
		User2.selectLanguage();
		t.printMes();
		
	}

}
