package com.learning.sgpd;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/mylogin")
public class Login extends HttpServlet {
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		handlelogin(request, response, "GET");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		handlelogin(request, response, "POST");
		
	}
	
	
	private void handlelogin(HttpServletRequest request, HttpServletResponse response, String method) throws IOException {
		String myemail = request.getParameter("email1");
		String mypass = request.getParameter("pass1");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.printf("<h2>Login Attempt using %s method</h2>", method );
		out.printf("<h3>Email: %s</h3>", myemail);
		out.printf("<h3>Password: %s</h3>", mypass);
		
		if(myemail.equals("honey@email.com") && mypass.equals("1234")) {
			out.println("<p style='color:green;'>Login Successful</p>");
			
		} else {
			out.println("<p style='color:red;'>Login Failed</p>");

		}
		
		// for get method, we can also print the query string
		if(method.equals("GET")) {
			String queryString = request.getQueryString();
			out.printf("<h3>Query String: %s</h3>", queryString);
		}
		
	}

}
