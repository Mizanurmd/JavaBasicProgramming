package Exam_03Years;

public class StaticTest {
	public static void main(String[] args) {
		System.out.println(StaticRelated.a);
		
		EmployeeStatic em = new EmployeeStatic(1, "Md.Mizanur Rahman", "Adabor-10, Dhaka-1207");
		em.display();
		System.out.println("====================second time=========================");
		EmployeeStatic em2 = new EmployeeStatic(2, "Md.Sizan Rahman", "Adabor-1, Dhaka-1207");
		em2.display();
	}

}
