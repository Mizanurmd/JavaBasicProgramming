package Exam_CodingTest_01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
	public static void main(String[] args) {
		
		List<Employee> employee = new ArrayList<>();
		Employee em = new Employee("ABC", 20, 10000);
		Employee em1 = new Employee("DDD", 22, 110000);
		Employee em2= new Employee("CCC", 23, 12000);
		Employee em3 = new Employee("ABC", 25, 15000);
		Employee em4 = new Employee("ABC", 28, 20000);
		employee.add(em);
		employee.add(em1);
		employee.add(em2);
		employee.add(em3);
		employee.add(em4);
		System.out.println("========Orginal Salary list ===============");
		System.out.println(employee);
		
		 List<Employee> incrementedSalary= employee.stream().map(e->{
			if(e.getAge()< 25) {
				e.setSalary(e.getSalary()* 1.10);
			}
			return e;
		
		}).collect(Collectors.toList());
		 
		 
		 System.out.println("Incremented Salary==============");
		 System.out.println(incrementedSalary);
		
	}

}
