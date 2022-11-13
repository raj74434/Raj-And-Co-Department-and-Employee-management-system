package com.rajandco.usedcasesOF_Employee;

import com.rajandco.Exceptions.EmployeeException;
import com.rajandco.dao.EmployeeIntr;
import com.rajandco.dao.EmployeeIntrImpl;
import com.rajandco.models.Employee;

public class ViewProfile {

	public void calling(String username,String password) {
		EmployeeIntr obj=new EmployeeIntrImpl();
        
        Employee m=null;
		try {
			m = obj.ViewProfile(username, password);
		} catch (EmployeeException e) {
			
			e.printStackTrace();
		}
        System.out.println(m);
	}
}
