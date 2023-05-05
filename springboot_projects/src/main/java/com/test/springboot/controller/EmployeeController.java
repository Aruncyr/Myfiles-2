package com.test.springboot.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.springboot.model.Employee;
import com.test.springboot.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/hello")
	public String HelloWorld(Model model) {
		System.out.println("hello...");
		return "index";
	}

	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Employee employee = new Employee();
		model.addObject("employee", employee);
		model.setViewName("EmployeeForm");
		return model;
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		if (employee.getId() == 0) {
			employeeService.saveEmployee(employee);
		} else {
			System.out.println("edit elase conditionm");
			employeeService.updateEmployee(employee);
		}

		return new ModelAndView("redirect:/all");
	}

	@RequestMapping(value = "/all")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		List<Employee> listEmployee = employeeService.getAllEmployees();
		model.addObject("listEmployee", listEmployee);
		model.setViewName("home");
		return model;

	}

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(HttpServletRequest request) {
		int employeeId = Integer.parseInt(request.getParameter("id"));
		employeeService.deleteEmployee(employeeId);
		return new ModelAndView("redirect:/all");
	}

	@RequestMapping(value = "/editEmployee", method = RequestMethod.GET) public
	  ModelAndView editContact(HttpServletRequest request) { int employeeId =
	  Integer.parseInt(request.getParameter("id")); Employee employee =
	  employeeService.getEmployee(employeeId); System.out.println("edit employee.."
	  + employee); ModelAndView model = new ModelAndView("EmployeeForm");
	  model.addObject("employee", employee);
	  
	  return model;
	  
	 }
}