package com.rajandco.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rajandco.Exceptions.EmployeeException;
import com.rajandco.utility.DBUtil;

public class Security {

	public static boolean admin(String username,String password) {
		
		boolean flag=false;
		
		if(username.equals("Raj") && password.equals("Raj")) {
			flag=true;
		}
		else {
			System.out.println("wrong username or password");
		}
		
		return flag;
	}
	
	public static boolean employee(String username,String password) throws EmployeeException {
boolean flag=false;
		
try(Connection cn=DBUtil.provideConnection()){
	
PreparedStatement ps=cn.prepareStatement("select * from employee where username=? AND password=?");
	ps.setString(1, username);
	ps.setString(2, password);
ResultSet rs=ps.executeQuery();

if(rs.next()) {
	flag=true;
}
else {
	 throw new EmployeeException("Username or Password is wrong");	
}

}catch(SQLException e) {
	throw new EmployeeException(e.getMessage());
}

		
		return flag;
	}
	
	
}
