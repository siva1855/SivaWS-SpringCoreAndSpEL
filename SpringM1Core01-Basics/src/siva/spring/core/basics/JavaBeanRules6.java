package siva.spring.core.basics;

import java.io.Serializable;
import java.util.Date;

public class JavaBeanRules6 implements Serializable {
	
	// Sun Rules

	// Rule--4
	private static final long serialVersionUID = 1L;
	// Rule--1
	private int empId;
	private String empName;
	private double empSal;
	private Date empJoinDate;

	// Rule--2
	public JavaBeanRules6() {
		super();
		
	}

	// Rule--3
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public Date getEmpJoinDate() {
		return empJoinDate;
	}

	public void setEmpJoinDate(Date empJoinDate) {
		this.empJoinDate = empJoinDate;
	}

   //Rule5
	@Override
	public String toString() {
		return "JavaBeanRules6 [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empJoinDate="
				+ empJoinDate + "]";
	}

}
