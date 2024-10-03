package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException{
		int sid=Integer.parseInt(req.getParameter("sid"));
		String sname=req.getParameter("sname");
		String scity=req.getParameter("scity");
		double spercentage= Double.parseDouble(req.getParameter("spercentage"));
//		System.out.println("sid:"+sid);
//		System.out.println("sname:"+sname);
//		System.out.println("scity:"+scity);
//		System.out.println("spercentage:"+spercentage);
	
		PrintWriter o1 = res.getWriter();
		o1.println("SID: "+sid);
		o1.println("SNAME: "+sname);
		o1.println("SCITY: "+scity);
		o1.println("SPERCENTAGE: "+spercentage);
	}
	
	
}
