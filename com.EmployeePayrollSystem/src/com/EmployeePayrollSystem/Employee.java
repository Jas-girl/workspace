package com.EmployeePayrollSystem;

public class Employee {
	String name;
	int employeeId;
	float salary;

	Employee() {

	}

	Employee(String name, int employeeId) {
		this.name=name;
		this.employeeId=employeeId;
	}

	Employee(String name, int employeeId, float salary) {
		this.name=name;
		this.employeeId=employeeId;
      this.salary=salary;
      
	}

	public Employee(String string) {
		this.name=name;
	}

	void calculatePay() {
		float monthlySalary = (salary / 12);
		System.out.println("Name:"+name+" EmployeeId:"+employeeId);
		System.out.println("Monthly salary:" + monthlySalary);
	}
}
