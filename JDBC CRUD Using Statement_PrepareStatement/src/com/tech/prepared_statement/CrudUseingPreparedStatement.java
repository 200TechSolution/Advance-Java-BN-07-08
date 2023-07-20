package com.tech.prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudUseingPreparedStatement {

	String url = "jdbc:mysql://localhost:3306/mysql07";

	String userName = "root";

	String password = "root";

	public void insertData() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection(url, userName, password);

		String sql = "insert into student values(?,?,?)";

		PreparedStatement pt = con.prepareStatement(sql);
		pt.setInt(1, 102);
		pt.setString(2, "Devang");
		pt.setString(3, "Nashik");

		pt.execute();

		System.out.println("Data Inserted Successfully");

		con.close();
		pt.close();

	}

	public void getData() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection(url, userName, password);

		String sql = "select * from  student";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println("**********************");
		}

		con.close();
		ps.close();
	}
	
	public void updateData() throws ClassNotFoundException, SQLException
	{

		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, userName, password);
		
		
		String sql="update student  set sName=?,addrs=? where sid=101";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		
		ps.setString(1, "Sajed");
		ps.setString(2, "Mumbai");
		
		ps.executeUpdate();
		
		System.out.println("Records Updated Successfully");
		con.close();
		ps.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		CrudUseingPreparedStatement c = new CrudUseingPreparedStatement();
		// c.insertData();
		c.updateData();
		c.getData();

	}

}
