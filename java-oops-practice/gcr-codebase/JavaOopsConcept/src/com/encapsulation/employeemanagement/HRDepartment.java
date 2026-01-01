package com.encapsulation.employeemanagement;


//HRDepartment implements Department
class HRDepartment implements Department {
	
	//attributes
	private String departmentName;

	//overriding method of parent class 
	@Override
	public void assignDepartment(String deptName) {
		this.departmentName = deptName;
	}

	//overriding method of parent class 
	@Override
	public String getDepartmentDetails() {
		return "Department: " + departmentName;
	}
}
