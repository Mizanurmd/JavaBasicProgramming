package Exam_ObjectCloneDetails;

public class Student implements Cloneable{
	private int id;
	private String name;
	private Addres addres;
	
	public Student(int id, String name, Addres addres) {
		this.id =id;
		this.name = name;
		this.addres = addres;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

}
