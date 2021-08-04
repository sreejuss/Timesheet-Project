package com.app.rest;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Admin;
import com.app.model.Employee;
import com.app.model.Timesheet;
import com.app.service.TimesheetService;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class TimesheetController {
	
	private TimesheetService timesheetSev;
	
	@Autowired
	public TimesheetController(TimesheetService timesheetSev) {
		super();
		this.timesheetSev = timesheetSev;
	}
	
//	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/timesheet")
	public List<Timesheet> findAll()
	{
		return timesheetSev.findAll();
	}
	
//	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/timesheet")
	public Timesheet addTimesheet(@RequestBody Timesheet theEmployee) {
		theEmployee.setId(0);
		timesheetSev.save(theEmployee);
		return theEmployee;
	}
	
//	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/timesheet")
	public Timesheet updateEmployee(@RequestBody Timesheet theEmployee) {
		timesheetSev.save(theEmployee);
		return theEmployee;
	}
	
	
//	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/timesheet/{id}")
	public List<Timesheet> updateTime(@PathVariable int id) {
		
		List<Timesheet> ts=timesheetSev.getTimeSheet(id);
//		timesheetSev.save(Timesheet);
		return ts;
	}
	

//	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/timesheets/{userId}")
	public Timesheet searchUser(@PathVariable int userId)
	{
		Timesheet theEmployee = timesheetSev.findById(userId);
		return theEmployee;
	}
	
	
	@GetMapping("/customdate/{date1}/{date2}")
	public List<Timesheet> custom(@PathVariable("date1")Date start,@PathVariable("date2")Date end)
	{
		List<Timesheet> theEmployee = timesheetSev.customTimeSheet(start,end);
		return theEmployee;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/custommonth/{year}/{month}")
	public List<Timesheet> customMonth(@PathVariable("year")int year,@PathVariable("month")int month)
	{
		List<Timesheet> theEmployee = timesheetSev.customTimeSheetByMonth(year,month);
		return theEmployee;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/customyear/{year}")
	public List<Timesheet> customYear(@PathVariable("year")int year)
	{
		List<Timesheet> theEmployee = timesheetSev.customTimeSheetByYear(year);
		return theEmployee;
	}
	

}
