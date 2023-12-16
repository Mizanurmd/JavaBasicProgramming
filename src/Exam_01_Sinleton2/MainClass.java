package Exam_01_Sinleton2;

public class MainClass {
	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.name ="Mizanur Rahman";
		System.out.println(obj.name);
		
		Employee obj2 = new Employee();
		obj2.name ="Mizanur Rahman";
		System.out.println(obj2.name);
		
		if(obj == obj2) {
			System.out.println("true");
		}else {
			System.out.println("False");
		}
	}

}
