package org.emp;

public class Employee {
	public void empId() {
		System.out.println("emp id 098754");

	}
	public void empName() {
		System.out.println("empname is Aravind");
		

	}
	public void empMail() {
		System.out.println("emp mail is jkajdsh@gmail.com");

	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empMail();
		
	}
}
