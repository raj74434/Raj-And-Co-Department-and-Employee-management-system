package com.rajandco.usedcases;

import java.util.Scanner;

import com.rajandco.Exceptions.DepartmentException;
import com.rajandco.dao.DepartmentIntr;
import com.rajandco.dao.DepartmentIntrImpl;
import com.rajandco.models.Employee;

public class RegisterNewEmployee {

	public RegisterNewEmployee(){}
	
	
	public RegisterNewEmployee(String args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name of Employee...");
		String name=sc.nextLine();
		System.out.println("Enter Address of Employee....");
		String add=sc.nextLine();
		System.out.println("Enter Email of Employee....");
		String email=sc.nextLine();
		System.out.println("Enter Username of Employee....");
		String User=sc.nextLine();
		System.out.println("Enter Password of Employee....");
		String pass=sc.nextLine();
		System.out.println("Enter Department Id....");
		int dep=sc.nextInt();

		DepartmentIntr d=new DepartmentIntrImpl();
		
		Employee e=new Employee();
		e.setAddress(add);
		e.setDepid(dep);
		e.setEmail(email);
		e.setName(name);
		e.setPassword(pass);
		e.setUsername(User);
		
		
		String m;
		try {
			m = d.registerNewEmployee(e);
			System.out.println(m);
		} catch (DepartmentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}

}
