package com.rajandco.usedcases;

import java.util.List;
import java.util.Scanner;

import com.rajandco.Exceptions.DepartmentException;
import com.rajandco.dao.DepartmentIntr;
import com.rajandco.dao.DepartmentIntrImpl;
import com.rajandco.dao.LeavesIntr;
import com.rajandco.dao.LeavesIntrImpl;
import com.rajandco.models.Leaves;

public class ShowAllLeaves {

	
public ShowAllLeaves(){}
	
	public ShowAllLeaves(String args) {
		Scanner sc=new Scanner(System.in);
		
		LeavesIntr obj=new LeavesIntrImpl();
		
		
		try {
			List<Leaves> m=obj.ShowAllLeaves();
			for(Leaves i: m) {
				System.out.println(i);
			}
			
		} catch (DepartmentException e) {
			System.out.println(e.getMessage());
		}

	}
	
	
}
