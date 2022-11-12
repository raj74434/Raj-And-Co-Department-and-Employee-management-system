package com.rajandco.usedcases;

import java.util.Scanner;

import com.rajandco.dao.DepartmentIntr;
import com.rajandco.dao.DepartmentIntrImpl;

public class AddNewDepartment {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Department Name...");
	String name=sc.nextLine();
	System.out.println("Enter Address of Department....");
	String add=sc.nextLine();

	DepartmentIntr d=new DepartmentIntrImpl();
	String m=d.addNewDepartment(name,add);
	System.out.println(m);
	}

}
