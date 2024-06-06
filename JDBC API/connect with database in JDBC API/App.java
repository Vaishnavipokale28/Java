package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class App 
{
    public static void main( String[] args )
    {
    	Connection con = null;
    	PreparedStatement pst = null;
    	int check = 0;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap66","root","root");
				String sql = "insert into t1(name,city) value(?,?)";
				pst = con.prepareStatement(sql);
				pst.setString(1, "sanvi");
				pst.setString(2,"Paithan");
				check = pst.executeUpdate();
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			System.out.println(check);
			
    }
}
