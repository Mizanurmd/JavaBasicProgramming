package Exam_PrototypeDesignPattern;

public class Department {
	private String depCode;
	private String depName;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String depCode, String depName) {
		super();
		this.depCode = depCode;
		this.depName = depName;
	}
	public String getDepCode() {
		return depCode;
	}
	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	@Override
	public String toString() {
		return "Department [depCode=" + depCode + ", depName=" + depName + "]";
	}
	

}
