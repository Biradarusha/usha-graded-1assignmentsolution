package com.department.main;

import com.department.model.AdminDepartment;
import com.department.model.HRDepartment;
import com.department.model.TechDepartment;

public class Driver  {
	public static void main(String[] args) {
		
		AdminDepartment AD1 = new AdminDepartment(); 
		System.out.println(" Welcome to " + AD1.departmentName());
		System.out.println(AD1.getTodaysWork());
		System.out.println(AD1.getWorkDeadline());
		System.out.println(AD1.isToadayAHoliday());
		
		System.out.println();
		
		HRDepartment HD1 = new HRDepartment();
		System.out.println(" Welcome to "+HD1.departmentName());
		System.out.println(HD1.doActivity());
		System.out.println(HD1.getTodaysWork());
		System.out.println(HD1.getWorkDeadline());
		System.out.println(HD1.isToadayAHoliday());
		
		System.out.println();
		
		TechDepartment TD1 = new TechDepartment();
		System.out.println(" welcome to "+TD1.departmentName());
		System.out.println(TD1.getTodaysWork());
		System.out.println(TD1.getWorkDeadline());
		System.out.println(TD1.getTechStackInformation());
		System.out.println(TD1.isToadayAHoliday());
	


		
		
		
		
		
			
		
	}
	

}
