package com.test.hibernatetemplate;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class EmployeeDao {
	private static HibernateTemplate hibernateTemplate;

	public HibernateTemplate geHibernateTemplate() {
		return hibernateTemplate;
	}

	@SuppressWarnings("static-access")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public void createEmployee(Employee e) {
		hibernateTemplate.save(e);
	}

	public Employee fetchEmployeeById(Integer employeeId) {
		return hibernateTemplate.get(Employee.class, employeeId);

	}

	@Transactional
	public Employee updateEmployeeEmailById(String newEmail, Integer employeeId) {
		Employee employee = hibernateTemplate.get(Employee.class, employeeId);
		employee.setEmail(newEmail);
		hibernateTemplate.update(employee);
		return hibernateTemplate.get(Employee.class, employeeId);
	}

	@Transactional
	public Employee deleteEmployeeById(Integer employeeId) {
		Employee employee = hibernateTemplate.get(Employee.class, employeeId);
		hibernateTemplate.delete(employee);
		return hibernateTemplate.get(Employee.class, employeeId);
	}

	public static List<Employee> fetchAllEmployees() {

		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Employee.class);
		@SuppressWarnings("unchecked")
		List<Employee> employeeList = (List<Employee>) hibernateTemplate.findByCriteria(detachedCriteria);
		return employeeList;
	}
}
