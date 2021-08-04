package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.app.model.Employee;
import com.app.model.Leave;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	

	public Optional<Employee> findByEmpid(int empid);

	@Query(value="SELECT * from emp_data where emp_data.email=:username",nativeQuery =true )
	public List<Employee> findByEmail(@Param("username")String username);


}
