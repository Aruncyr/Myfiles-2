package com.test.springboot.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.springboot.dao.EmployeeDao;
import com.test.springboot.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	@Transactional
	public Employee saveEmployee(Employee employee) {
		employeeDao.save(employee);
		return employee;
	}

	@Transactional
	public List<Employee> getAllEmployees() {
		return employeeDao.findAll();
	}

	@Override

	@Transactional
	public void deleteEmployee(Integer employeeId) {
		employeeDao.deleteById(employeeId);
	}

	@SuppressWarnings("deprecation")
	public Employee getEmployee(int empid) {
		return employeeDao.getById(empid);
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public Employee updateEmployee(Employee e) {
		return employeeDao.save(e);
	}

}
