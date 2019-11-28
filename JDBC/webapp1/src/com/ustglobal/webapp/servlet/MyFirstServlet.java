package com.ustglobal.webapp.servlet;

import java.io.PrintWriter;
import java.rmi.ServerException;
import java.util.Date;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServerException,IOException{
		
		
		System.out.println("service method");
		System.out.println("extra line of code");
		
		ServletContext context = getServletContext();
		String companyName = context.getInitParameter("company-name");
		
		ServletConfig config = getServletConfig();
		String batchName = config.getInitParameter("batch-name");
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out. println("<html>");
		out.println("<body>");
		
		Date date =new Date();
		out.println("<h1 style = 'color:red'>Date and time is :");
		out.println(date);
//		out.println(date.toString());   both are same 
		out.println("</h1>");
		
		out.println("<h2>");
		out.println(companyName);
		out.println("</h2>");
		
		out.println("<h2>");
		out.println(batchName);
		out.println("</h2>");
		
		String url = req.getRequestURI();
		String method = req.getMethod();
		out.println("<br>");
		out.println(url);
		out.println("<br>");
		out.println(method);
		
		out.println("</html>");
		out.println("</body>");
		
	}
}
