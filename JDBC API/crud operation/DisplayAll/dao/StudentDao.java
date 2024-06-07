package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	public int deleteStudentBySid(int sid)
	{
		int check = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap66","root","root");
			String sql = "delete from Student where sid=?";
			pst = con.prepareStatement(sql);
			pst.setInt(1,sid);
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

	public Student findstudentBySid(int sid)
	{
		Student s1 = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap66","root","root");
			String sql = "select sid,sname,scity,spercentage from student where sid=?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, sid);
			rs = pst.executeQuery();
			while(rs.next())
			{
				s1 = new Student();
				s1.setSid(rs.getInt("sid"));
				s1.setSname(rs.getString("sname"));
				s1.setScity(rs.getString("scity"));
				s1.setSpercentage(rs.getDouble("spercentage"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		finally
		{
			try {
				rs.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return s1;
	}
	
	public List<Student> findAllStudent()
	{
		List<Student> list = new ArrayList();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap66","root","root");
			String sql = "select sid,sname,scity,spercentage from student";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next())
			{
				Student s1 = new Student();
				s1.setSid(rs.getInt("sid"));
				s1.setSname(rs.getString("sname"));
				s1.setScity(rs.getString("scity"));
				s1.setSpercentage(rs.getDouble("spercentage"));
				list.add(s1);
				
			}
		} catch (SQLException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		finally
		{
			try {
				rs.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return list;
		
	}
	
}
