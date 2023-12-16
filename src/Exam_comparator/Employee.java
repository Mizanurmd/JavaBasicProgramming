package Exam_comparator;

public class Employee implements Comparable<Employee> {
	private String name;
	private int experience;
	private int age;
	private int salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int experience, int age, int salary) {
		super();
		this.name = name;
		this.experience = experience;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	

	@Override
	public int compareTo(Employee empTem) {
//		// this condition for Ascending order
//		if(this.experience > empTem.getExperience()) {
//			return 1;
//		}else if(this.experience < empTem.getExperience()) {
//			return -1;
//		}
//		return 0;
		
		// this condition for Descending order
				if(this.experience  < empTem.getExperience()) {
					return 1;
				}else if(this.experience >  empTem.getExperience()) {
					return -1;
				}
				return 0;
	}
	
	

}
