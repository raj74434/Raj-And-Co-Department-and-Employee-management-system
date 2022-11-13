package com.rajandco.dao;

import com.rajandco.Exceptions.EmployeeException;
import com.rajandco.models.Employee;

public interface EmployeeIntr {
	
	public Employee ViewProfile(String username,String password) throws EmployeeException;
	
	public String  ChangePassword(String username,String password,String newPassword); 

	public  String ApplyLeave(String username,String password);
	
	public String updateProfile(String username,String password);
	
	
	
}
