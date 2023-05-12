package com.test.restful.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.restful.dao.EmployeeDao;
import com.test.restful.model.Employee;
import com.test.restful.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeDao repo;
	@Autowired
	private EmployeeService employeeservice;

	@RequestMapping(value = "/all")
	public ResponseEntity<List<Employee>> listEmployee() {
		return new ResponseEntity<List<Employee>>(employeeservice.getAllEmployees(), HttpStatus.OK);
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public String saveEmployee(@RequestBody Employee employee) {
		if (employee.getId() == 0) {
			employeeservice.saveEmployee(employee);
		}
		return "Saved Successfully";
	}

	@GetMapping("/employeeById/{id}")
	public ResponseEntity<Employee> getcById(@PathVariable int id) {
		if (repo.findById(id).isPresent()) {
			return new ResponseEntity<Employee>(employeeservice.getEmployee(id), HttpStatus.OK);
		}
		return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee> deleteById(@PathVariable("id") int id) {
		if (repo.findById(id).isPresent()) {
			repo.deleteById(id);
			return new ResponseEntity<Employee>(HttpStatus.OK);
		}
		return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(value = "/editEmployee/{id}", method = RequestMethod.PUT) 
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value="id")int employeeId, @RequestBody Employee employee) {
		employee.setId(employeeId);
		Employee emp = employeeservice.updateEmployee(employee);
        return new ResponseEntity<>(emp, HttpStatus.OK);
	}
}
