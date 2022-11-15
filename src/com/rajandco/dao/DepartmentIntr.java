package com.rajandco.dao;

import java.util.List;

import com.rajandco.Exceptions.DepartmentException;
import com.rajandco.models.Department;
import com.rajandco.models.Employee;

public interface DepartmentIntr {

	public  String registerNewEmployee(Employee e) throws DepartmentException;
	
	public List<Department> showAllDepartment() throws DepartmentException;
	
	public String UpdateDepartmentName(int id);
	
	public String addNewDepartment(String dname,String address);
	
	public String transferEmployeeDepartments(int Eid,int depid)throws DepartmentException;
	
	public String leavesAcceptOrDeny(int eid,boolean flag)throws DepartmentException;
	
	
	
	
}
