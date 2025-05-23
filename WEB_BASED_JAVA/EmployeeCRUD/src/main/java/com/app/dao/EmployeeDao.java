package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.bean.Employee;

public class EmployeeDao {
	
	public static Connection getConnection() throws SQLException
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Found");
			con = DriverManager.getConnection("jdbc:mysql://192.168.100.80:3306/group024","group024","welcome");
			System.out.println("Connection Established");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		return con;
	}
	
	
	public static int AddEmp(Employee e) throws SQLException
	{
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("insert into emptb(name,password,email,gender,country) value(?,?,?,?,?)");
		stmt.setString(1, e.getName());
		stmt.setString(2, e.getPassword());
		stmt.setString(3, e.getEmail());
		stmt.setString(4, e.getGender());
		stmt.setString(5, e.getCountry());
		int status = stmt.executeUpdate();
		
		return status;
		
		
	}
	
	
	public static List<Employee> getAllEmployees() throws SQLException
	{
		List<Employee> l = new ArrayList<Employee>();
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("select *from emptb");
		ResultSet rs = stmt.executeQuery();
		while(rs.next())
		{
			Employee e = new Employee();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setPassword(rs.getString(3));
			e.setEmail(rs.getString(4));
			e.setGender(rs.getString(5));
			e.setCountry(rs.getString(6));
			l.add(e);
		}
		return l;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
