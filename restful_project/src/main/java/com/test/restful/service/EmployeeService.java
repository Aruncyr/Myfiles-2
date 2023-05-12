package com.test.restful.service;

import java.util.List;
import java.util.Optional;

import com.test.restful.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee saveEmployee(Employee employee);

	public Employee getEmployee(int employeeid);

	public void deleteById(int employeeId);

	public Employee updateEmployee(Employee employee);

	public static Optional<Employee> findById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
