package com.rajandco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.rajandco.Exceptions.EmployeeException;
import com.rajandco.models.Employee;
import com.rajandco.utility.DBUtil;

public class EmployeeIntrImpl implements EmployeeIntr  {
	
	Scanner sc=new Scanner(System.in);

	@Override
	public Employee ViewProfile(String username, String password) throws EmployeeException {				
		Employee obj=new Employee();
		 
		try(Connection cn=DBUtil.provideConnection()){
			
PreparedStatement  ps=cn.prepareStatement("select * from employee where username=? AND password=?");
		 ps.setString(1, username);
		 ps.setString(2, password);
		 
		 ResultSet rs=ps.executeQuery();

			if(rs.next()) {
			
            obj.setName(rs.getString("name"));
            obj.setEid(rs.getInt("eid"));
            obj.setEmail(rs.getString("email"));
            obj.setAddress(rs.getString("address"));
            obj.setUsername(rs.getString("username"));
            obj.setPassword(rs.getString("password"));
            obj.setDepid(rs.getInt("did"));
			
			}
			else {
				throw new EmployeeException("Username or password is wrong");
			}
			
		 
		}
		catch(SQLException e) {
			
		}
		
		
		
		
		return obj;
	}

	@Override
	public String ChangePassword(String username, String password, String newPassword ) {
		
		String m="Not able to change password";
		
		try(Connection cn=DBUtil.provideConnection()){
PreparedStatement ps=cn.prepareStatement("UPDATE Employee set password=? where username=? AND password=?");
			ps.setString(1,newPassword);
            ps.setString(2, username);
            ps.setString(3, password);
            
            int x=ps.executeUpdate();
            
            if(x<1) {
            	m="Username or password is wrong";
            }
            else {
            	
            	m="Password change sucess";
            }

		}
		catch(SQLException e) {
			m=e.getMessage();
		}
		return m;
	}

	@Override
	public String ApplyLeave(String username, String password) {
		
		String m="Unable to insert leave request";
		
		try(Connection cn=DBUtil.provideConnection()){
			
PreparedStatement ps=cn.prepareStatement("select eid from employee where username=? AND password=? ");
			
        ps.setString(1, username);  
		ps.setString(2, password);	
				
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			int id=rs.getInt("eid");
			
			System.out.println("Enter Reason and date of Leave.......");
			
			String reason=sc.nextLine();
			
			PreparedStatement ps2=cn.prepareStatement("insert into leaves values(?,?,?)");
			ps2.setInt(1, id);
			ps2.setString(2, reason);
			ps2.setString(3, "Pending");
			int l=ps2.executeUpdate();
			
			if(l>0) {
				m="Leave request submited.....";
			}
		}
		else {
			m="Incorrect username or password";
		}
		
			}catch(SQLException e) {
			m=e.getMessage();
		}
		
		return m;
}


	
	@Override
	public String updateProfile(String username, String password) {
		
		String m="Unable to update";
		
		System.out.println("Press 1 for update name.....");
		System.out.println("Press 2 for update address.....");
		System.out.println("Press 3 for update email.....");
		
		
		int choice=Integer.parseInt(sc.nextLine());
		
		try(Connection cn=DBUtil.provideConnection()){
			
			PreparedStatement ps=null;
			
			 if(choice == 1) {
				 System.out.println("Enter new Name...");
				 
				 String namNew=sc.nextLine();
ps=cn.prepareStatement("update employee set name=? where username=? AND password=?");	
				ps.setString(1, namNew);
				ps.setString(2, username);
				ps.setString(3, password);
			 }
			 else if(choice == 2) {
				 System.out.println("Enter new Address...");
				 String add=sc.nextLine();
ps=cn.prepareStatement("update employee set address=? where username=? AND password=?");	
				ps.setString(1, add);
				ps.setString(2, username);
				ps.setString(3, password);
			 }
			 else if(choice == 3) {
				 System.out.println("Enter new Email...");
				 String email=sc.nextLine();
ps=cn.prepareStatement("update employee set email=? where username=? AND password=?");	
				ps.setString(1, email);
				ps.setString(2, username);
				ps.setString(3, password);
				 
			 }
			 
			int x= ps.executeUpdate();
			
			if(x>0) {
				m="Update Success.......";
			}
			
		}catch(SQLException e) {
			m=e.getMessage();
		}
			
		return m;
	}



	
	
}
