package com.test.hibernatetemplate;

//spring hibernate integration example with hibernatetemplate (same as springhibernateintegrationwithht_project)
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		EmployeeDao employeeDao = getEmployeeBean();
		@SuppressWarnings("unused")
		Employee e = new Employee();
/*		e.setEmail("rajesh123@gmail.com");
		e.setEmployeeName("rajesh");
		e.setSalary((double) 80000.00);
		employeeDao.createEmployee(e);

		e.setEmail("rahul123@gmail.com");
		e.setEmployeeName("rahul");
		e.setSalary((double) 80000.00);
		employeeDao.createEmployee(e);

		e.setEmail("ravi544@gmail.com");
		e.setEmployeeName("ravi");
		e.setSalary((double) 40000.00);
		employeeDao.createEmployee(e);

		e.setEmail("harsha23@gmail.com");
		e.setEmployeeName("harsha");
		e.setSalary((double) 60000.00);
		employeeDao.createEmployee(e);

		e.setEmail("ram12@gmail.com");
		e.setEmployeeName("ram");
		e.setSalary((double) 70000.00);
		employeeDao.createEmployee(e);

		e.setEmail("jesh239@gmail.com");
		e.setEmployeeName("james");
		e.setSalary((double) 50000.00);
		employeeDao.createEmployee(e);

		e.setEmail("white876@gmail.com");
		e.setEmployeeName("white");
		e.setSalary((double) 65000.00);
		employeeDao.createEmployee(e);

		e.setEmail("blueice3289@gmail.com");
		e.setEmployeeName("tom");
		e.setSalary((double) 76000.00);
		employeeDao.createEmployee(e);

		e.setEmail("cherry097@gmail.com");
		e.setEmployeeName("orange");
		e.setSalary((double) 69000.00);
		employeeDao.createEmployee(e);

		e.setEmail("vgghgg8876@gmail.com");
		e.setEmployeeName("walter");
		e.setSalary((double) 68000.00);
		employeeDao.createEmployee(e);*/
		
		Employee employee = employeeDao.fetchEmployeeById(3);
		System.out.println(employee.getEmail());
		Employee employee1 = employeeDao.updateEmployeeEmailById("cyr.rajesh2010@gmail.com", 1);
		System.out.println(employee1.getEmail());
		//@SuppressWarnings("unused")
		/*Employee employee2 = employeeDao.deleteEmployeeById(9);
		System.out.println("success");*/
		fetchAllEmployeesInfo(employeeDao);
	}

	private static void fetchAllEmployeesInfo(EmployeeDao employeeDao) {
		List<Employee> emplist = EmployeeDao.fetchAllEmployees();
		// emplist.forEach(System.out::println);
		for (Employee emp : emplist) {
			System.out.println(emp.getEmployeeId() + "  " + emp.getEmployeeName() + "  " + emp.getEmail() + "  "
					+ emp.getSalary());

		}

	}

	public static EmployeeDao getEmployeeBean() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
		return employeeDao;
	}

}
