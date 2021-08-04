package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.app.model.Admin;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
