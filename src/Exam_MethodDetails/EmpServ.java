package Exam_MethodDetails;

public class EmpServ {
	
	//=== Method Arguments
	public void display(Emp e) {
		System.out.println("Id : "+e.getId()+ "Name : "+e.getName());
	}
	
	///=====Method return
	public Emp printALl() {
		Emp em = new Emp(1, "Sizan");
		return em;
	}
}
