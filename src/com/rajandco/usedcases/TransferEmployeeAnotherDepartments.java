package com.rajandco.usedcases;

import java.sql.SQLException;
import java.util.Scanner;

import com.rajandco.Exceptions.DepartmentException;
import com.rajandco.dao.DepartmentIntr;
import com.rajandco.dao.DepartmentIntrImpl;

public class TransferEmployeeAnotherDepartments {
	
	public TransferEmployeeAnotherDepartments(){
		
	}

	public TransferEmployeeAnotherDepartments(String a) {
	
		
        Scanner sc=new Scanner(System.in);
		
		DepartmentIntr d=new DepartmentIntrImpl();
		
	System.out.println("Enter Employee id ");
	int eid=sc.nextInt();
	System.out.println("Enter DepartmentId in which you want to tranfer... ");
	int did=sc.nextInt();	
	
	
		try {
			
		String m=	d.transferEmployeeDepartments(eid, did);
		System.out.println(m);
		}
		catch(DepartmentException e) {
			System.out.println(e.getMessage());
		}

	}

}
