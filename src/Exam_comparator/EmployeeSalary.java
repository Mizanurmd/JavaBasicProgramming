package Exam_comparator;

import java.util.Comparator;

public class EmployeeSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee s1, Employee s2) {
		if(s1.getSalary() >  s2.getSalary()) {
			return 1;
		}else if(s1.getSalary() <  s2.getSalary()) {
			return -1;
		}
		return 0;
	}

}
