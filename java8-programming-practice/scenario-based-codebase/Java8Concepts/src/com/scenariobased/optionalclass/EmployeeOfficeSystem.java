package com.scenariobased.optionalclass;

import java.util.Optional;

//Custom Exception
class EmployeeNotFoundException extends RuntimeException {
	EmployeeNotFoundException(String msg) {
		super(msg);
	}
}

class Employee {
	//attributes
	String firstName;
	String middleName;
	String lastName;
	String email;
	Double bonus;
	String insurance;
	Employee manager;

	//constructor
	Employee(String firstName, String middleName, String lastName,
			String email, Double bonus, String insurance, Employee manager) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.bonus = bonus;
		this.insurance = insurance;
		this.manager = manager;
	}
}

//main class
public class EmployeeOfficeSystem {

	public static void main(String[] args) {

		Employee manager = new Employee(
				"Anil", null, "Kumar",
				"anil@company.com", 20000.0, "LIC", null
				);

		Employee emp = new Employee(
				"Ravi", null, "Sharma",
				"ravi@company.com", null, null, manager
				);

		//  Fetch manager details safely
		Optional.ofNullable(emp.manager)
			.ifPresentOrElse(
					m -> System.out.println("Manager: " + m.firstName),
					() -> System.out.println("No Manager Assigned")
             );

		//  Fetch bonus, default 0 if not defined
		Double bonusAmount = Optional.ofNullable(emp.bonus)
				.orElse(0.0);
		System.out.println("Bonus: " + bonusAmount);

		//  Find employee by email else throw exception
		Employee foundEmp = findEmployeeByEmail("test@company.com")
				.orElseThrow(() ->
				new EmployeeNotFoundException("Employee not found"));

		//  Get insurance details safely
		String insurance = Optional.ofNullable(emp.insurance)
				.orElse("Insurance not available");
		System.out.println("Insurance: " + insurance);

		//  Display middle name only if present
		Optional.ofNullable(emp.middleName)
			.ifPresent(m -> System.out.println("Middle Name: " + m));
	}

 static Optional<Employee> findEmployeeByEmail(String email) {
     return Optional.empty(); // simulate not found
 	}
}

