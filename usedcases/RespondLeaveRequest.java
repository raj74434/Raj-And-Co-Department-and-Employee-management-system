package com.rajandco.usedcases;

import java.util.Scanner;

import com.rajandco.Exceptions.DepartmentException;
import com.rajandco.dao.DepartmentIntr;
import com.rajandco.dao.DepartmentIntrImpl;

public class RespondLeaveRequest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		DepartmentIntr obj=new DepartmentIntrImpl();
		System.out.println("Employee id .....");
		int id=sc.nextInt();
		
		 boolean flag=true;
		System.out.println("Press 1 for accept");
		System.out.println("Press 2 for deny");
		int res=sc.nextInt();
		if(res==2) {flag=false;}
		
		try {
			String m=obj.leavesAcceptOrDeny(id, flag);
			
			System.out.println(m);
		} catch (DepartmentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
