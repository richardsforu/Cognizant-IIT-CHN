package com;

import org.springframework.context.annotation.Configuration;

//@Service(value="emp")
//@Repository(value="emp")
//@Controller(value="emp")
//@Component("emp")
//@Component
@Configuration
public class Employee {

	private int empId;
	private String empName;

	private Department dept;

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
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

}