package Exam_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class TestMain {
	public static void main(String[] args) {
		List<Employee> em = new  ArrayList<>();
		em.add(new Employee("Mizanur",8, 30,30000));
		em.add(new Employee("Tawhidul",9, 32, 30000));
		em.add(new Employee("Mamun",4, 25, 40000));
		em.add(new Employee("Raz",5, 23, 60000));
		
		System.out.println( "=========== Before sorting ====================");
		
		em.forEach(e ->{
			System.out.println("Name = "+ e.getName()+" Experience = "+ e.getExperience()+" Age = "
		+ e.getAge()+ " Salary ="+e.getSalary());
		});
		
		// using sort method for sorting
		System.out.println( "=========== After default sorting as Exprience using comaparable Interface(compareTo() )====================");
		Collections.sort(em);
		
		em.forEach(e ->{
			System.out.println("Name = "+ e.getName()+" Experience = "+ e.getExperience()+" Age = "
		+ e.getAge()+ " Salary ="+e.getSalary());
		});
		
		System.out.println( "=========== After user defiend sorting as age  using comaparator Interface(compare() )====================");
		Collections.sort(em, new EmployyeAge());
		
		em.forEach(e ->{
			System.out.println("Name = "+ e.getName()+" Experience = "+ e.getExperience()+" Age = "
		+ e.getAge()+ " Salary ="+e.getSalary());
		});
		
		System.out.println( "=========== After user defiend sorting as Salary  using comaparator Interface(compare() )====================");
		Collections.sort(em, new EmployeeSalary());
		
		em.forEach(e ->{
			System.out.println("Name = "+ e.getName()+" Experience = "+ e.getExperience()+" Age = "
		+ e.getAge()+ " Salary ="+e.getSalary());
		});
		
	}

}
