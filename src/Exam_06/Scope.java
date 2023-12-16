package Exam_06;

public class Scope {
	private int a;
	public Scope(int a) {
		this.a = a;
		
	}
	public void print(int a) {
		System.out.println("a: "+ a);
		System.out.println("This.a: "+ this.a);
	}

	public static void main(String[] args) {
		Scope scope = new Scope(29);
		scope.print(7);
	}
}
