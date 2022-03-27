package com.department.model;

public class HRDepartment extends SuperDepartment{
	
	public String departmentName() {
		return "HR Department";
		
	}

	public String getTodaysWork() {
		return "Fill Today's Worksheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete By EOD";
		
	}
	
	public String doActivity() {
		return "team Lunch";
	}
}

