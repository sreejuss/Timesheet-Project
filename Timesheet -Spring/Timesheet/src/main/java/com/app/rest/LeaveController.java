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

import com.app.model.Leave;
import com.app.model.Timesheet;
import com.app.service.LeaveService;

@RestController
@RequestMapping("/api")
public class LeaveController {
	
	private LeaveService leaveServ;
	
	@Autowired
	public LeaveController(LeaveService leaveServ) {
		super();
		this.leaveServ = leaveServ;
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/leaves")
	public List<Leave> findAll()
	{
		return leaveServ.findAll();
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/leaves/{userId}")
	public Leave searchUser(@PathVariable int userId)
	{
		Leave theEmployee = leaveServ.findById(userId);
		return theEmployee;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/leave/{id}")
	public List<Leave> getLeavee(@PathVariable int id) {
		
		List<Leave> ts=leaveServ.getLeave(id);
//		timesheetSev.save(Timesheet);
		return ts;
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/leaves")
	public Leave addEmployee(@RequestBody Leave theEmployee) {
		theEmployee.setId(0);
		leaveServ.save(theEmployee);
		return theEmployee;
	}
	
	
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/leaves")
	public Leave updateEmployee(@RequestBody Leave theEmployee) {
		leaveServ.save(theEmployee);
		return theEmployee;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/leaves/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		Leave theEmployee=leaveServ.findById(employeeId);
		if(theEmployee==null) {
			throw new RuntimeException("Employee id not found"+employeeId);
			
		}
		leaveServ.deleteById(employeeId);
		return "Deleted employee id="+employeeId;
	}
	
	
	
	
	

}
