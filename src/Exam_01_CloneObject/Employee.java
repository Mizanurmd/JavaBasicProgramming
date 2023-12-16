package Exam_01_CloneObject;

public class Employee implements Cloneable {
	private int id;
	private String name;
	
	
	

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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	// Create a clone method here
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

}
