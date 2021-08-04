package com.app.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.app.model.Leave;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface LeaveRepo extends JpaRepository<Leave, Integer> {


	@Query(value="SELECT * from leave_data where leave_data.empid=:id",nativeQuery =true )
	public List<Leave> getLeave(@Param("id")int id);

}
