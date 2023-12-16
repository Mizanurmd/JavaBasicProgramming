package Exam_ObjectCloneDetails;

public class Addres implements Cloneable {
	private int id;
	private String state;
	
	public Addres(int id, String state) {
	this.id = id;
	this.state = state;
	
	}

	

	@Override
	public String toString() {
		return "Addres [id=" + id + ", state=" + state + "]";
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
