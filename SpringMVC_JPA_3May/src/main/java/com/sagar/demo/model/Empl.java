package com.sagar.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empl {

	@Id
	private Integer empNo;
	private String empName;
	private Integer empSal;
	
	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Integer empSal) {
		this.empSal = empSal;
	}
	public Empl() {
		// TODO Auto-generated constructor stub
	}

}
