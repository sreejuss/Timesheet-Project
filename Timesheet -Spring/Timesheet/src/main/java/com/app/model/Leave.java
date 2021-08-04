package com.app.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leave_data")
public class Leave {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="empid")
	private int empid;
	
	
	
	@Column(name="status")
	private String status;
	
	@Column(name="leavetype")
	private String leavetype;
	
	@Column(name="leavedate")
	private Date leavedate;
	
	@Column(name="nodays")
	private int nodays;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLeavetype() {
		return leavetype;
	}

	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}

	public Date getLeavedate() {
		return leavedate;
	}

	public void setLeavedate(Date leavedate) {
		this.leavedate = leavedate;
	}

	public int getNodays() {
		return nodays;
	}

	public void setNodays(int nodays) {
		this.nodays = nodays;
	}

	public Leave(int id, String name, int empid, String status, String leavetype, Date leavedate,
			int nodays) {
		super();
		this.id = id;
		this.name = name;
		this.empid = empid;
//		this.leavename = leavename;
		this.status = status;
		this.leavetype = leavetype;
		this.leavedate = leavedate;
		this.nodays = nodays;
	}

	public Leave() {
		super();
	}
	
	

}
