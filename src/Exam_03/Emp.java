package Exam_03;

public class Emp {
	String name;
	int empId;
	String designation;
	String address;
	int phone;
	int salary;
	
	Emp(String name, int empId){
		this.name= name;
		this.empId = empId;
		System.out.println(" Employee name : "+name +"\n Employee Id : "+ empId);
	}
	
	 Emp(String designation) {
		 this("Mizanur Rahman",102);
		this.designation = designation;
		System.out.println(" Employee Designation : "+ designation); 
		
	}
	 
	 Emp( String address,int phone, int salary) {
		 	this("Sr.Software Enginner");
			this.address =address;
			this.phone = phone;
			this.salary = salary;
					
			System.out.println(" Employee Address : "+ address +"\n Phone No : "+ phone + "\n Salary ="+ salary); 
			
		}
	
public static void main(String[] args) {
	//Emp e = new Emp("Mizanur Rahman",102);
	//Emp e1 = new Emp("Sr.Software Enginner");
	Emp e2 = new Emp("Adabor-01, Dhaka-1207",01236547, 30000);
	
}
	
}
