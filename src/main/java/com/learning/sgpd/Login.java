package com.learning.sgpd;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/mylogin")
public class Login extends HttpServlet {
		
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String myemail = request.getParameter("email1");
		String mypass = request.getParameter("pass1");
		
		if(myemail.equals("honey@email.com") && mypass.equals("1234")) {
			response.getWriter().println("Login Successful");
			
		} else {
			response.getWriter().println("Login failed");
		}
		
		
	}

}
