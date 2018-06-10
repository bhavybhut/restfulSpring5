package bhavy.restfulSpring5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bhavy.restfulSpring5.entity.Employee;
import bhavy.restfulSpring5.service.EmployeeService;

@RestController //This is same as @Controller and @ResponseBody
@RequestMapping(value = "employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Employee> findAll(){
		return service.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public Employee findOne(@PathVariable("id") String empId) {
		return service.findOne(empId);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Employee create(@RequestBody Employee employee) {
		return employee;
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "{id}")
	public Employee update(@PathVariable("id") String empId, @RequestBody Employee employee) {
		return employee;
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")
	public void delete(@PathVariable("id") String empId) {
		
	}
}