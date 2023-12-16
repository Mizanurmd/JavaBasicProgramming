package Exam_StringBufferDetails;

public class IntegerExample5 {
	public static void main(String[] args) {
		int x =10;
		
		Test t = new Test();
		t.m1(x);
		
	}

}
class Test{
	
	public static void m1(long l) {
		System.out.println("Wedding Boxing");
	}
	public static void m1(int i) {
		System.out.println("Auto Boxing");
	}
	
}