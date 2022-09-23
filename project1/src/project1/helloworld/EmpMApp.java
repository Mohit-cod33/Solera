package project1.helloworld;

import java.time.LocalDate;

public class EmpMApp {
	public static void main(String []args) {
		employee empl=new employee();
		Address add=new Address();

		add.setAddressId(1);
		add.setStreet("indus valley road");
		add.setCity("Bangaluru");
		add.setState("Karnataka");
		
		empl.setEmpId(01);
		empl.setName("Mohit kumar");
		empl.setDateOfBirth(LocalDate.of(1999, 02, 8));
		empl.setSalary(45000.9);
		
		empl.setAddress(add);
		System.out.println(empl);
		
		employee empp=new employee(011,"Kumar",43000, LocalDate.of(1999, 02, 8), add);
		
		System.out.println();
		System.out.println(empp);
		 
		
		
	}

}
