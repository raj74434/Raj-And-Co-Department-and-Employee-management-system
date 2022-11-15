package com.rajandco.dao;

import java.util.List;

import com.rajandco.Exceptions.DepartmentException;
import com.rajandco.models.Leaves;

public interface LeavesIntr {

	public List<Leaves> ShowAllLeaves() throws DepartmentException;
		
	
	
}
