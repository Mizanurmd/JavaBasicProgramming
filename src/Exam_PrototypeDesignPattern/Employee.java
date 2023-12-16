package Exam_PrototypeDesignPattern;

public class Employee implements Cloneable{
	private int id;
	private String name;
	private String address;
	private Department department;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String address, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address +",department="+ department+ "]";
	}
	
	///////// Create a method for copying object
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

}
