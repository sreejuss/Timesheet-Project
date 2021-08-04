package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.AdminRepo;
import com.app.model.Admin;


@Service
public class AdminServImpl implements AdminService{
	
	
	private AdminRepo adminRepository;
	
	
	@Autowired
	public AdminServImpl(AdminRepo adminRepository) {
	super();
	this.adminRepository = adminRepository;
}


	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		
		return adminRepository.findAll();

	}
}
