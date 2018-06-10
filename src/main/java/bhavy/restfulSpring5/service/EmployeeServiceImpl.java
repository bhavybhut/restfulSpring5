package bhavy.restfulSpring5.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bhavy.restfulSpring5.entity.Employee;
import bhavy.restfulSpring5.exception.EmployeeNotFoundException;
import bhavy.restfulSpring5.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public List<Employee> findAll() {
		return repository.findAll();
	}

	@Override
	public Employee findOne(String empId) {
		Employee employee = repository.findOne(empId);
		if(employee == null) {
			throw new EmployeeNotFoundException("Employee with id " + empId + " NOT FOUND");
		}
		else {
			return employee;
		}
	}

	@Override
	public Employee create(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee update(String empId, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String empId) {
		// TODO Auto-generated method stub
		
	}

}
