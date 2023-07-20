package com.tech.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;



public class JdbcDemo {
	
	String url="jdbc:mysql://localhost:3306/mysql07";
	
	String userName="root";
	
	String password="root";
	
	// insert data into Student table
	public void saveData() throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, userName, password);
		
		String sql="insert into student values(103,'Yogesh','Pune')";
		
		Statement smt=con.createStatement();
		
		smt.execute(sql);
		
		System.out.println("Data Inserted into Student Table Successfully");
		smt.close();
		con.close();
		
		
		
	}
	
	//to get Records from Student table
	public void getData() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, userName, password);
		
		String sql="select sName,addrs from student";
		//	String sql="select * from student ";
		Statement smt=con.createStatement();
		
	 
		
		ResultSet rs= smt.executeQuery(sql);
		  
		while(rs.next())
		{
		System.out.println(rs.getString(1));
		System.out.println(rs.getString(2));
		
		}
		smt.close();
		con.close();
	}
	
	
	public void updateData() throws ClassNotFoundException, SQLException
	{
       Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, userName, password);
		
		//String sql="update student set sname='Mayur' where addrs='Pune'";
		
		String sql="UPDATE student set sname='Sajed' , addrs='Vaijapur' where sid=101";
		
		Statement smt=con.createStatement();
		
		int x=smt.executeUpdate(sql);
		
		if(x!=0)
		{
			System.out.println("Data updated successfully");
		}
		else
		{
			System.out.println("Record Not found");
		}
		
		smt.close();
		con.close();
		
		
		}
	
	public void deleteData() throws ClassNotFoundException, SQLException
	{
        Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, userName, password);
		
		String sql="delete from student where sid=103";
		
		Statement smt=con.createStatement();
		
		  int x= smt.executeUpdate(sql);
		  System.out.println(x);
		  
		  if(x!=0)
		  {
			  System.out.println("Data Deleted successfully");
		  }
		  else
		  {
			  System.out.println("Record Not found");
		  }
		  
		  con.close();
		  smt.close();
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		JdbcDemo d=new JdbcDemo();
		         
		         d.getData();
		
	}

}
