package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("service method");
		System.out.println("extra line of code");

		ServletContext context = getServletContext();
		String companyName = context.getInitParameter("Company-name");

		ServletConfig config = getServletConfig();
		String batchName = config.getInitParameter("batch-name");




		PrintWriter out = resp.getWriter();	
		resp.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");

		Date date = new Date();	//current date entry//
		out.println("<h1 style='color: Red'>Date and Tiem is:");
		out.println(date.toString());	//String represantation of date//
		out.println("<h1>");

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

		out.println("</body>");
		out.println("</html>");

	}


}
