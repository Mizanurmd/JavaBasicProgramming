package Exam_06;

public class Assignment {
	private int value;
	
	public Assignment(int value) {
		this.value = value;
	}

	public void inc(Assignment assignment) {
		assignment.value++;
	}
	
	public void inc(int assignment) {
		assignment++;
	}
	
	public static void main(String[] args) {
		
		Assignment assignmentX = new Assignment(23);
		Assignment assignmentY = new Assignment(59);
		int a =7;
		
		System.out.println(assignmentX.value);
		System.out.println(assignmentY.value);
		System.out.println(a);
		
		assignmentX.inc(assignmentY);
		System.out.println("================================");
		System.out.println(assignmentX.value);
		System.out.println(assignmentY.value);
		System.out.println(a);
		
		assignmentX.inc(a);
		System.out.println("================================");
		System.out.println(assignmentX.value);
		System.out.println(assignmentY.value);
		System.out.println(a);
		
	}
}
