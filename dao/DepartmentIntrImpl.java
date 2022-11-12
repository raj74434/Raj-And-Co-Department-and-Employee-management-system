package com.rajandco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rajandco.Exceptions.DepartmentException;
import com.rajandco.models.Department;
import com.rajandco.models.Employee;
import com.rajandco.utility.DBUtil;

public class DepartmentIntrImpl implements DepartmentIntr {

	@Override
	public  String addNewDepartment( String dname, String address) {
		
		String m="Not able to insert";
		
		try(Connection cn=DBUtil.provideConnection()){
PreparedStatement ps=cn.prepareStatement("insert into department(name,address) values(?,?)");
ps.setString(1,dname);
ps.setString(2,address);

        int x= ps.executeUpdate();
          if(x>0) {
        	  m="Department insertion sucess";
          }
          
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return m;
	}

	
	@Override
	public List<Department> showAllDepartment() throws DepartmentException{
		
		List<Department> l=new ArrayList<>();
		
		try(Connection cn=DBUtil.provideConnection()){
			PreparedStatement p= cn.prepareStatement("select * from department");
		
			ResultSet rs=p.executeQuery();
			while(rs.next()) {
			Department d=new Department();
			d.setAddress(rs.getString("address"));
			d.setName(rs.getString("Name"));
			d.setDepid(rs.getInt("Depid"));
			l.add(d);
			}
			
			if(l.size()<1) {
				throw new DepartmentException("No department to show");
			}
			
		}
		catch(SQLException e) {
			throw new DepartmentException("Unable to get departments...");
		}
		
		return l;
	}
	
	
	@Override
	public String UpdateDepartmentName() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String registerNewEmployee(Employee e) throws DepartmentException  {
		
		try(Connection cn=DBUtil.provideConnection()){
			
			String name = e.getName();
			String email = e.getEmail();
			String address = e.getAddress();
			String username = e.getUsername();
			String password =e.getPassword();
			int depid = e.getDepid();
			
PreparedStatement ps=cn.prepareStatement(
		"insert into employee(name,email,address,username,password,did) values(?,?,?,?,?,?)");

ps.setString(1, name);
ps.setString(2, email);
ps.setString(3, address);
ps.setString(4, username);
ps.setString(5, password);
ps.setInt(6, depid);
int x=ps.executeUpdate();

if(x<1) {
	throw new DepartmentException("Not able to insert");
}
		}catch(SQLException ee) {
			throw new DepartmentException(ee.getMessage());
		}
		
		return "Username "+e.getUsername()+"  is registered & Password is =  " +e.getPassword(); 
	}


	
	
	
	@Override
	public String transferEmployeeDepartments(int eid, int depid) throws DepartmentException {
		
		String m="Not able to change Department";
		
		try(Connection cn=DBUtil.provideConnection()){
			
			PreparedStatement ps=cn.prepareStatement("Update Employee set did=? where eid=?");
			ps.setInt(1, depid);
			ps.setInt(2, eid);
			int x=ps.executeUpdate();
			
			if(x<1) {
				throw new DepartmentException("Unable to chnage department");
			}
			else {
				m="Employee with id= "+eid+" has been shifted to Department = "+depid;
			}
		}
		catch(SQLException e) {
			throw new DepartmentException(e.getMessage());
		}
		return m;
	}


	
	
	
	@Override
	public String leavesAcceptOrDeny(int eid,boolean flag) throws DepartmentException{
		
		String m="Not able accept or deny leave";
		try(Connection cn=DBUtil.provideConnection()){
				
		PreparedStatement ps=cn.prepareStatement("select * from leaves where EmpId =?");	
		ps.setInt(1, eid);
		
		ResultSet x=ps.executeQuery();	
		 if(x.next()==false) {
			 throw new  DepartmentException("Employee with this employee id did not applied for leave")	;
		 }
		   else {
			   PreparedStatement ps2=cn.prepareStatement("update leaves set status =? where EmpId=? ");
			  
			  
		if(flag) {
			 ps2.setString(1,"accept" );	
			 ps2.setInt(2, eid);
			 ps2.executeUpdate();
			 m="Leave is accepted";
		}
		else {
			ps2.setString(1,"Deny" );
			 ps2.setInt(2, eid);
			 ps2.executeUpdate();
			 m="Leave is denyed";
		}
		
		        }
		
		
		}
		catch(SQLException e){
		throw new  DepartmentException(e.getMessage())	;
		}
		
		return m;
	}

	
	

	

	

	

	

	

	
	
	
}
