package Exam_Serialization;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4952181387354244924L;
	private int id;
	private String name;
	private String addres;
	private String mobile;
	public Student(int id, String name, String addres, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.addres = addres;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addres=" + addres + ", mobile=" + mobile + "]";
	}
	
	

}
