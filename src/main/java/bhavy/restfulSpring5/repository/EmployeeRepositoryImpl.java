package bhavy.restfulSpring5.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import bhavy.restfulSpring5.entity.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

	@Override
	public List<Employee> findAll() {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("bhavy", "bhavybhut@gmail.com", 2000));
		empList.add(new Employee("bhavy1", "bhavybhut1@gmail.com", 3000));
		empList.add(new Employee("bhavy2", "bhavybhut2@gmail.com", 4000));
		return empList;
	}

	@Override
	public Employee findOne(String empId) {
		//return new Employee("findOneBhavy", "bhavybhutFindOne@gmail.com", 8000);
		return null;
	}

}
