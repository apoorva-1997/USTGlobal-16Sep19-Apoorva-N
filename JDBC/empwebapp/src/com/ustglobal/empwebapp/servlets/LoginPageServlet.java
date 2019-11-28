package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		String id ="";
		Cookie[] cookies = req.getCookies();
		if(cookies!=null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("alwaysRemember")) {				//check cookie is present or not if present paste in id
				
					id =cookie.getValue();
				}
			}
		}
		out.println("<html>");
		out.println("<fieldset align='center'>");
		out.print("<legend>Login</legend>");
		out.print("<form action='./login' method='post' >");
		out.print("Id : <input name = 'id' type= 'number' value = '"+id+"'><br><br>");
		out.print("Password : <input name = 'password' type= 'password'><br><br>");
		out.print("<input name = 'Rembember Me' type= 'checkbox' value = 'check'> Remember me<br><br>");
		out.print("<input name = 'Reset' type= 'reset' value='reset'>");
		out.print("<input name='login' type='submit' value ='login' class='btn float-right'><br><br>");
		out.print("</form>");
		out.print("</fieldset>");
		out.print("<a href = './register.html' >register</a>");
		out.println("<html>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
