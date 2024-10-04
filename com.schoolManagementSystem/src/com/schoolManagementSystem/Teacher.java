package com.schoolManagementSystem;

public class Teacher extends Person {
	int employeeId;
	String subjects;

	String displayInfo(String name, int age, int employeeId, String subjects) {
		super.name = name;
		super.age = age;
		this.employeeId = employeeId;
		this.subjects = subjects;
		return "Teacher [name=" + super.name + ", age=" + super.age + ", employeeId=" + employeeId + ", subjects="
				+ subjects + "]";

	}
}
