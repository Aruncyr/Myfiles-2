package com.test.restful.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.restful.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
