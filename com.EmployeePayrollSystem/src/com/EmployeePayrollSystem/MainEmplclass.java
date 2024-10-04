package com.EmployeePayrollSystem;

public class MainEmplclass {
public static void main(String[] args) {
	Employee obj1=new Employee("Jasleen",23);
	obj1.calculatePay();
	Employee obj2=new Employee("Aman",22,2300);
	obj2.calculatePay();
	Employee obj3=new Employee("Rahul");
	obj3.calculatePay();
	
}
}
