package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Student;

public class StudentDao {
	
	public int insertStudent(Student s)
	{
		int check =0;
		Connection con = null;
		PreparedStatement pst = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap66","root","root");
			String sql = "insert into student(sname,scity,spercentage)values(?,?,?)";
			pst = con.prepareStatement(sql);
			pst.setString(1,s.getSname());
			pst.setString(2, s.getScity());
			pst.setDouble(3,s.getSpercentage());
			check = pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		finally
		{
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return check;
	}

}
