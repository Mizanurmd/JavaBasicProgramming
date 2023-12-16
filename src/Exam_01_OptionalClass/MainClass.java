package Exam_01_OptionalClass;

import java.util.Optional;

public class MainClass {
	public static void main(String[] args) {
		
		Dto d = new Dto();
	Optional<Employee>	e= d.getEmployee(15);
	
	if(e.isPresent()) {
		System.out.println("Id = "+ e.get().getId()+" Name "+
				  e.get().getName()+" dept ="+e.get().getDept());
	}else {
		System.out.println("Id is not founded!!!");
	}
		
	/*
	 * if(null !=e) { System.out.println("Id = "+ e.get().getId()+" Name "+
	 * e.get().getName()+" dept ="+e.get().getDept()); }else {
	 * System.out.println("Id is not founded!!!"); }
	 */
		
	}

}
