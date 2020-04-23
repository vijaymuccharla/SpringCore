package com.vj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.vj.bo.StudentBO;

/*
	mysql> create table LayeredAppStudentDetails(sno int(10),sname varchar(25),sadd varchar(20),total int(10),average float(10),result varchar(10));
	Query OK, 0 rows affected, 2 warnings (0.81 sec)
	mysql> select * from LayeredAppStudentDetails;
	Empty set (0.00 sec)
 */
public final class StudentDAOImpli implements StudentDAO{

	//association
	private DataSource ds=null;
	//SQL query
	private static final String INSERT_STUDENT_DETAILS="INSERT INTO LAYEREDAPPSTUDENTDETAILS VALUES(?,?,?,?,?,?)";
	

	//constructor injection as DS is mandatory
	public StudentDAOImpli(DataSource ds) {
		System.out.println("StundentDAOImpli : 1-param constructor");
		this.ds = ds;

	}

	//JDBC code to collect inputs from BO and insert into DB table	
	@Override
	public int insert(StudentBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;

		
		//JDBC driver is registered via DataSource already, use it
		//establish connection with DB 
		con=ds.getConnection();

		//create PreparedStatement obj and compile the query in DB
		ps=con.prepareStatement(INSERT_STUDENT_DETAILS);
		//set query params with BO object values
		if(ps!=null) {
			ps.setInt(1, bo.getSno());
			ps.setString(2, bo.getSname());
			ps.setString(3, bo.getSaddrs());
			ps.setInt(4, bo.getTotal());
			ps.setFloat(5, (float) bo.getAvg());
			ps.setString(6, bo.getResult());

			//execute query (non-select) INSERT
			count=ps.executeUpdate();
		}//if
		
		if(con!=null)
			con.close();		
		if(ps!=null)
			ps.close();
		
		//return result
		return count;
	}//insert

}//class

