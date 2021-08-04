package com.app.service;

import java.sql.Date;
import java.util.List;

import com.app.dao.TimesheetRepo;
import com.app.model.Employee;
import com.app.model.Timesheet;

public interface TimesheetService {
	
	List<Timesheet> findAll();

	void save(Timesheet theEmployee);
	
	public List<Timesheet> getTimeSheet(int id);

	Timesheet findById(int userId);

	List<Timesheet> customTimeSheet(Date start, Date end);

	List<Timesheet> customTimeSheetByMonth(int year, int month);

	List<Timesheet> customTimeSheetByYear(int year);
	
	
	

}
