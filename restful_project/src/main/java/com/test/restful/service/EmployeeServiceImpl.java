package com.test.restful.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.restful.dao.EmployeeDao;
import com.test.restful.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		employeeDao.save(employee);
		return employee;
	}

	@SuppressWarnings("deprecation")
	@Override
		public Employee getEmployee(int employeeid) {
		      return employeeDao.getById(employeeid);
		  }

	@Override
	public void deleteById(int employeeId) {
		employeeDao.deleteById(employeeId);		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDao.save(employee);
	}
		
	

	
}
