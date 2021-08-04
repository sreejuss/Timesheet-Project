package com.app.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.dao.AdminRepo;
import com.app.dao.TimesheetRepo;
import com.app.model.Employee;
import com.app.model.Timesheet;


@Service
public class TimesheetServImpl implements TimesheetService {
	
	private TimesheetRepo timesheetRepository;

	public TimesheetServImpl(TimesheetRepo timesheetRepository) {
		super();
		this.timesheetRepository = timesheetRepository;
	}

	@Override
	public List<Timesheet> findAll() {
		// TODO Auto-generated method stub
		return timesheetRepository.findAll();
	}

	@Override
	public void save(Timesheet theEmployee) {
		// TODO Auto-generated method stub
		timesheetRepository.save(theEmployee);	
	}

	@Override
	public List<Timesheet> getTimeSheet(int id) {
		// TODO Auto-generated method stub
		return timesheetRepository.getTimeSheet(id);
	}

	@Override
	public Timesheet findById(int userId) {
		// TODO Auto-generated method stub
		Optional<Timesheet> u = timesheetRepository.findById(userId);
		Timesheet theUser = u.get();
		return theUser;	}

	@Override
	public List<Timesheet> customTimeSheet(Date start, Date end) {
		// TODO Auto-generated method stub
		return timesheetRepository.customTimeSheet(start, end);
	}

	@Override
	public List<Timesheet> customTimeSheetByMonth(int year,int month) {
		// TODO Auto-generated method stub
		return timesheetRepository.customMonth(year, month);
	}

	@Override
	public List<Timesheet> customTimeSheetByYear(int year) {
		// TODO Auto-generated method stub
		return timesheetRepository.customYear(year);
	}

}
