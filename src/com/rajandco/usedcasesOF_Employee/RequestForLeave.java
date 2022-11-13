package com.rajandco.usedcasesOF_Employee;

import java.util.Scanner;

import com.rajandco.dao.EmployeeIntr;
import com.rajandco.dao.EmployeeIntrImpl;

public class RequestForLeave {
	
	public void calling(String username,String password) {
		EmployeeIntr obj=new EmployeeIntrImpl();
        
        String m= obj.ApplyLeave(username, password);
        System.out.println(m);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("Enter username");
//          String user= sc.nextLine();
//          System.out.println("Enter password");
//          String pass= sc.nextLine();
          
          
          
	}

}
