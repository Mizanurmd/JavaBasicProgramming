package Exam_01_OptionalClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dto {
	
	public Optional<Employee>  getEmployee(Integer id) {
		List<Employee>emp = new ArrayList<>();
		emp.add(new Employee(1,"Mizanur", "softare"));
		emp.add(new Employee(2,"Sizan", "IT"));
		emp.add(new Employee(3,"Tawhidul", "Software"));
		emp.add(new Employee(4,"Mamun", "softare"));
		emp.add(new Employee(5,"Rakib", "HR"));
		
		Employee em = null;
		
		for(Employee empTem : emp) {
			if(id.equals(empTem.getId())) {
				em = new Employee();
				em.setId(empTem.getId());
				em.setName(empTem.getName());
				em.setDept(empTem.getDept());
				break;
			}
		}
		return Optional.ofNullable(em);
		
	}

}
