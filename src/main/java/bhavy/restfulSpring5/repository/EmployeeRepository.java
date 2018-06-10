package bhavy.restfulSpring5.repository;

import java.util.List;

import bhavy.restfulSpring5.entity.Employee;

public interface EmployeeRepository {
	List<Employee> findAll();
	Employee findOne(String empId);
}
