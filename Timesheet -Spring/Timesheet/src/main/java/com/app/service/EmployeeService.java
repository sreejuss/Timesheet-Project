package com.app.service;

import java.util.List;

import com.app.model.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();

	void save(Employee theEmployee);

	Employee findById(int userId);

	void deleteById(int employeeId);


//	int getCount();

	Employee findByEmpid(int empid);

	List<Employee> findByEmail(String username);

}
