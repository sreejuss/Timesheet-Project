package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.EmployeeRepo;
import com.app.model.Employee;
import com.app.model.Leave;
import com.app.service.EmployeeService;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	private EmployeeService employeeService;
	private EmployeeRepo employeeRepo;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/employees")
	public List<Employee> findAll()
	{
		return employeeService.findAll();
	}
	
	

	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/employees/{userId}")
	public Employee searchUser(@PathVariable int userId)
	{
		Employee theEmployee = employeeService.findById(userId);
		return theEmployee;
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee theEmployee) {
		theEmployee.setId(0);
		employeeService.save(theEmployee);
		return theEmployee;
	}
	
	
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {
		employeeService.save(theEmployee);
		return theEmployee;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		Employee theEmployee=employeeService.findById(employeeId);
		if(theEmployee==null) {
			throw new RuntimeException("Employee id not found"+employeeId);
			
		}
		employeeService.deleteById(employeeId);
		return "Deleted employee id="+employeeId;
	}
	

	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/employee/{empid}")
	public Employee getEmp(@PathVariable int empid)
	{
		Employee theEmployee = employeeService.findByEmpid(empid);
		return theEmployee;
	}
	
	@GetMapping("/test/{username}")
	public List<Employee> getEmp(@PathVariable String username)
	{
		List<Employee> theEmployee = employeeService.findByEmail(username);
		return theEmployee;
	}
	

	
	
}
