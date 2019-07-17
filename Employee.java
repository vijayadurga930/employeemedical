package com.cg.MIS.presentation;

public class Employee {
	String name;
     double salary;
     int id;
     String designation;
     String insurancescheme;
	public Employee(String name, int salary, int id, String designation, String insurancescheme) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
		this.designation = designation;
		this.insurancescheme = insurancescheme;
	}
	public Employee() {
		super();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsurancescheme() {
		return insurancescheme;
	}
	public void setInsurancescheme(String insurancescheme) {
		this.insurancescheme = insurancescheme;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + ", designation=" + designation
				+ ", insurancescheme=" + insurancescheme + "]";
	}
}

	