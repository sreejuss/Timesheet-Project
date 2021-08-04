package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dao.AdminRepo;
import com.app.model.Admin;
import com.app.service.AdminService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
	
	private AdminService adminService;
	
	
	
	@Autowired
	public RestController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}


	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/admin")
	public List<Admin> findAll()
	{
		return adminService.findAll();
	}
	
}
