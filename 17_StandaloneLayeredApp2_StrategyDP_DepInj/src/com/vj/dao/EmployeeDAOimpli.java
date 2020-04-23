package com.vj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.vj.bo.EmployeeBO;

public final class EmployeeDAOimpli implements EmployeeDAO{

	private DataSource ds;
	private static final String EMPLOYEE_DETAILS_INSERT="INSERT INTO LAYERED_EMPLOYEE VALUES(?,?,?,?,?,?,?)";
	
	public EmployeeDAOimpli(DataSource ds) {
		System.out.println("EmployeeDAOimpli : 1-param contructor");
		this.ds = ds;
	}

	@Override
	public int insert(EmployeeBO bo)  throws Exception{
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		
		//enstablish connection with DB using the dependent object
		con=ds.getConnection();
		//create JDBC PreparedStatemnet obj
		ps=con.prepareStatement(EMPLOYEE_DETAILS_INSERT);
		//set query params using BO object
		ps.setInt(1, bo.getEmpId());
		ps.setString(2, bo.getEmpName());
		ps.setString(3, bo.getDept());
		ps.setString(4, bo.getCompany());
		ps.setFloat(5, bo.getBaseSal());
		ps.setFloat(6, bo.getGrossSal());
		ps.setFloat(7, bo.getEmpSal());
		
		//send and execute the query
		count=ps.executeUpdate();
		
		if(con!=null)
			con.close();
		if(ps!=null)
			ps.close();
		
		return count;
			
	}//insert
	
}//class
