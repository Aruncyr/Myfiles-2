package com.test.springmvc.service;

import java.util.List;

import com.test.springmvc.model.Employee;

public interface EmployeeService {
	public List<Employee> listEmployees();

	public void addEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public Employee getEmployeeById(int id);

	public void removeEmployee(int id);
	
}
