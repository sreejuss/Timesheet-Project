package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.LeaveRepo;
import com.app.model.Employee;
import com.app.model.Leave;

@Service
public class LeaveServiceImpl implements LeaveService {
	
	private LeaveRepo leaveRepe;
	
	
	@Autowired
	public LeaveServiceImpl(LeaveRepo leaveRepe) {
		super();
		this.leaveRepe = leaveRepe;
	}



	@Override
	public List<Leave> findAll() {
		// TODO Auto-generated method stub
		return leaveRepe.findAll();
	}



	@Override
	public Leave findById(int userId) {
		// TODO Auto-generated method stub
		Optional<Leave> u = leaveRepe.findById(userId);
		Leave theUser = u.get();
		return theUser;
	}



	@Override
	public void save(Leave theEmployee) {
		// TODO Auto-generated method stub
		
		leaveRepe.save(theEmployee);
		
	}



	@Override
	public void deleteById(int employeeId) {
		// TODO Auto-generated method stub
		
		leaveRepe.deleteById(employeeId);
		
	}



	@Override
	public List<Leave> getLeave(int id) {
		// TODO Auto-generated method stub
		return leaveRepe.getLeave(id);
	}





}
