package Exam_ObjectCloneDetails;

public class CloneObject {
	public static void main(String[] args) throws CloneNotSupportedException {
		Addres ad = new Addres(101, "Bangladesh");
		Student ob = new Student(1, "Mizan",ad);
		System.out.println("Orginal Object of Student ="+ob);
		// clone object of student
		Student cOb = (Student)ob.clone();
		System.out.println("Clone Object of Student ="+ cOb);
	}

}
