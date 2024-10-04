package com.schoolManagementSystem;

public class Mainclass {
	public static void main(String[] args) {
		Student st = new Student();
		System.out.println(st.displayInfo("jasleen", 20, 10, 'B'));

		Teacher t = new Teacher();
		System.out.println(t.displayInfo("Aman", 30, 20, "English"));
	}

}
