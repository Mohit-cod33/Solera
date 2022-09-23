package project1.helloworld;

import java.time.LocalDate;

public class employee {
	
	private int empId;
	private String name;
	private double salary;
	private LocalDate DateOfBirth;
	//String address
	
	
	private Address address; // Has-A relationship
	
	public employee() {
		
	}
	
	public employee(int empId, String name, double salary, LocalDate dateOfBirth, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		DateOfBirth = dateOfBirth;
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", DateOfBirth=" + DateOfBirth
				+ ", address=" + address + "]";}

}
