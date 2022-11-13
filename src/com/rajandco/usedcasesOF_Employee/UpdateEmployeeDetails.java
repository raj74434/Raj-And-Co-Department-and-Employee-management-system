package com.rajandco.usedcasesOF_Employee;

import java.util.Scanner;

import com.rajandco.dao.EmployeeIntr;
import com.rajandco.dao.EmployeeIntrImpl;

public class UpdateEmployeeDetails {
	
	public void calling(String username,String password) {
		EmployeeIntr obj=new EmployeeIntrImpl();
        
        String m= obj.updateProfile(username, password);
        System.out.println(m);
	}
	
	
	
	
	

//	public static void main(String[] args) {
//		
//		
//		
//		Scanner sc=new Scanner(System.in);
//		
//		EmployeeIntr obj=new EmployeeIntrImpl();
//		
////		obj.updateProfile(, null);
//		
//	} 
	
}
