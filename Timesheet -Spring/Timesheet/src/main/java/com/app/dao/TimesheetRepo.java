package com.app.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.app.model.Timesheet;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface TimesheetRepo extends JpaRepository<Timesheet, Integer> {
		
		@Query(value="SELECT * from Timesheet where Timesheet.empid=:id",nativeQuery =true )
		public List<Timesheet> getTimeSheet(@Param("id")int id);
		
		@Query(value="SELECT * FROM timesheet WHERE tdate BETWEEN :start and :end",nativeQuery =true )
		public List<Timesheet> customTimeSheet(@Param("start")Date start,@Param("end")Date end);
		
		
		
		@Query(value="SELECT * FROM timesheet WHERE year(tdate)=:year and month(tdate)=:month",nativeQuery =true )
		public List<Timesheet> customMonth(@Param("year")int year,@Param("month")int month);
		
		@Query(value="SELECT * FROM timesheet WHERE year(tdate)=:year ",nativeQuery =true )
		public List<Timesheet> customYear(@Param("year")int year);

	
}


