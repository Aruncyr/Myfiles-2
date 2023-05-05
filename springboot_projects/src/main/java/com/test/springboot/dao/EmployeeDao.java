package com.test.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.springboot.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
