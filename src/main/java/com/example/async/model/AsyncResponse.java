package com.example.async.model;

public class AsyncResponse {

	private EmployeeAddresses addresses;
	private EmployeeNames employeeNames;
	private EmployeePhone employeePhone;
	
	public EmployeeAddresses getAddresses() {
		return addresses;
	}
	public void setAddresses(EmployeeAddresses addresses) {
		this.addresses = addresses;
	}
	public EmployeeNames getEmployeeNames() {
		return employeeNames;
	}
	public void setEmployeeNames(EmployeeNames employeeNames) {
		this.employeeNames = employeeNames;
	}
	public EmployeePhone getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(EmployeePhone employeePhone) {
		this.employeePhone = employeePhone;
	}
	
	
}
