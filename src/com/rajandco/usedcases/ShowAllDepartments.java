package com.rajandco.usedcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.rajandco.Exceptions.DepartmentException;
import com.rajandco.dao.DepartmentIntr;
import com.rajandco.dao.DepartmentIntrImpl;
import com.rajandco.models.Department;

public class ShowAllDepartments {
	
	public ShowAllDepartments(){}

	public ShowAllDepartments(String show){
		Scanner sc=new Scanner(System.in);
		
		DepartmentIntr d=new DepartmentIntrImpl();
		
//	
		
		try {
		
		List<Department> l=	d.showAllDepartment();
		l.forEach(s -> System.out.println(s));
		
		} catch (DepartmentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
