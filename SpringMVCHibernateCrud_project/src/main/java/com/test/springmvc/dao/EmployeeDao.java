package com.test.springmvc.dao;

import java.util.List;

import com.test.springmvc.model.Employee;

public interface EmployeeDao {
	public List<Employee> listEmployees();

	public void addEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public Employee getEmployeeById(int id);

	public void removeEmployee(int id);
	
}
