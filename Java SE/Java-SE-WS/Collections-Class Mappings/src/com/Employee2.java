package com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class Employee2 {
	private int empId;
	private String empName;
	private double salary;
	private Calendar dob;

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empId;
	}

	@Override
	public boolean equals(Object obj) {
		Employee2 emp = (Employee2) obj;
		return emp.getEmpId() == empId;
	}

	public Employee2(int empId, String empName, double salary, Calendar dob) {

		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dob = dob;
	}

	public static Calendar setDate(int dd, int mm, int yyyy) {
		Calendar cl = Calendar.getInstance();
		cl.set(yyyy, mm, dd);
		return cl;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Calendar getDob() {
		return dob;
	}

	public void setDob(Calendar dob) {
		this.dob = dob;
	}

	public static void disolay_V1(List<Employee2> emps) {
		SimpleDateFormat sdm = new SimpleDateFormat("dd/MMM/yyyy");
		System.out.println("Emp Id\tName\tSalary\t\tDate of Birth");
		System.out.println("----------------------------------------------");
		for (Employee2 emp : emps) {
			System.out.print(emp.getEmpId() + " \t");
			System.out.print(emp.getEmpName() + " \t");
			System.out.print(emp.getSalary() + " \t");
			System.out.print(sdm.format(emp.getDob().getTime()) + " \t");
			System.out.println();

		}
		System.out.println("----------------------------------------------");
	}

	public static void display(Employee2 emp) {
		SimpleDateFormat sdm = new SimpleDateFormat("dd/MMM/yyyy");
		System.out.println("Emp Id: " + emp.getEmpId());
		System.out.println("Name: " + emp.getEmpName());
		System.out.println("Salary: " + emp.getSalary());
		System.out.println("DOB: " + sdm.format(emp.getDob().getTime()));
		System.out.println("-----------------------------");
	}

}
