package Exam_comparator;

import java.util.Comparator;

public class EmployyeAge implements Comparator<Employee> {

	@Override
	public int compare(Employee e, Employee e2) {
		if(e.getAge() >  e2.getAge()) {
			return 1;
		}else if(e.getAge() <  e2.getAge()) {
			return -1;
		}
		return 0;
	}

}
