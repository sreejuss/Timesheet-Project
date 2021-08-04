package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeRepo;
import com.app.model.Employee;

@Service
public class EmployeeServImpl implements EmployeeService {
	
	
	private EmployeeRepo employeeRepo;
	
	@Autowired
	public EmployeeServImpl(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		employeeRepo.save(theEmployee);
		
	}

	@Override
	public Employee findById(int userId) {
		// TODO Auto-generated method stub
		Optional<Employee> u = employeeRepo.findById(userId);
		Employee theUser = u.get();
		return theUser;
	}
	
	
	@Override
	public Employee findByEmpid(int empid) {
		// TODO Auto-generated method stub
		Optional<Employee> u = employeeRepo.findByEmpid(empid);
		Employee theUser = u.get();
		return theUser;
	}

	
	
	@Override
	public void deleteById(int employeeId) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(employeeId);
		
	}

	@Override
	public List<Employee> findByEmail(String username) {
		// TODO Auto-generated method stub
		return employeeRepo.findByEmail(username);

	}


}
