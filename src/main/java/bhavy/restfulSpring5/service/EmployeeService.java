package bhavy.restfulSpring5.service;

import java.util.List;

import bhavy.restfulSpring5.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	Employee findOne(String empId);
	Employee create(Employee employee);
	Employee update(String empId, Employee employee);
	void delete(String empId);
}
