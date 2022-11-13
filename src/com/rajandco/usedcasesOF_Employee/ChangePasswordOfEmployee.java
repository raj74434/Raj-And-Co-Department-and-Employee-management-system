package com.rajandco.usedcasesOF_Employee;

import java.util.Scanner;

import com.rajandco.dao.EmployeeIntr;
import com.rajandco.dao.EmployeeIntrImpl;

public class ChangePasswordOfEmployee {
	
	public void calling(String username,String password) {
		Scanner sc=new Scanner(System.in);
		
		EmployeeIntr obj=new EmployeeIntrImpl();
        
		System.out.println("Enter old password....");
		String passOld=sc.nextLine();
		System.out.println("Enter new password.........");
		String passNew=sc.nextLine();
		
		
		String m=obj.ChangePassword(username, passOld, passNew);
		System.out.println(m);
		
       
	}

	public static void main(String[] args) {
		
		
		
	}
	
	
}
