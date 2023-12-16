package Exam_03Years;

public class EmployeeStatic {
	private int id;
	static String comName ="MMP";
	private String name;
	private String address;
	public EmployeeStatic(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
public void display() {
	
		System.out.println("Emp id= "+id +"\nCompany name = "+comName+ "\nEmployee name="+ name +"\nAddress ="+address);
	}

	

}
