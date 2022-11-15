package com.rajandco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rajandco.Exceptions.DepartmentException;
import com.rajandco.models.Leaves;
import com.rajandco.utility.DBUtil;

public class LeavesIntrImpl implements LeavesIntr {

	@Override
	public List<Leaves> ShowAllLeaves() throws DepartmentException {
		
		List<Leaves> l=new ArrayList<>();
		
		try(Connection cn=DBUtil.provideConnection()){
		
		PreparedStatement ps=cn.prepareStatement("select * from Leaves");
		ResultSet rs=ps.executeQuery();
		
		
		while(rs.next()) {
			
			Leaves lv=new Leaves();
			
			lv.setEid(rs.getInt("EmpId"));
			lv.setReason(rs.getString("ReasonAndDate"));
			lv.setStatus(rs.getString("status"));
			l.add(lv);
		}
				
		}catch(SQLException e) {
			throw new DepartmentException("Unable to show Leaves");
		}
		
		return l;
	}

	
	
}
