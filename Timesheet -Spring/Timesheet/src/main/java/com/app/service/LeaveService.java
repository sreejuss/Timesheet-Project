package com.app.service;

import java.util.List;

import com.app.model.Employee;
import com.app.model.Leave;

public interface LeaveService {

	List<Leave> findAll();

	Leave findById(int userId);

	void save(Leave theEmployee);

	void deleteById(int employeeId);

	List<Leave> getLeave(int id);

//	List<Leave> findByEmpid(int userId);

//	List<Leave> getTimeSheet(int id);

}
