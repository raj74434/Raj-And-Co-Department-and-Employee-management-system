package com.rajandco.usedcases;

import java.util.Scanner;

import com.rajandco.dao.DepartmentIntr;
import com.rajandco.dao.DepartmentIntrImpl;
import com.rajandco.models.Department;

public class UpdateDepartmentDetails {

	public UpdateDepartmentDetails() {
		
	}
	
	public UpdateDepartmentDetails(String args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id of Depaartment in which you want to Update");
		int id = sc.nextInt();
		
		DepartmentIntr obj=new DepartmentIntrImpl();
		
		String m=obj.UpdateDepartmentName( id);
		System.out.println(m);
	}

}
