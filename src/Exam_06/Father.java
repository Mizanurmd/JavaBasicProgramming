package Exam_06;

public class Father {
	public void name() {
		System.out.println("This is Father");

	}
	
	public static void main(String[] args) {
		Father father = new Father();
		Son son = new Son();
		Father againFather = new Son();
		
		father.name();
		son.name();
		againFather.name();
	}

}
