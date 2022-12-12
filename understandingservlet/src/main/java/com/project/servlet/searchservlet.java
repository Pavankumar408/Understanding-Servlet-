package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class searchservlet  extends HttpServlet{
	public searchservlet() {
		System.out.println("object is created:"+this.getClass().getName());
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("searchservlet.service()");
	response.setContentType("text/html");
	PrintWriter writer=response.getWriter();
	writer.print("<html>");
	writer.print("<body");
	writer.print("<h1>");
	writer.print("this is my search link");
	writer.print("</h1>");
	writer.print("<h3> <a href=http://localhost:8086/understandingservlet/> click to homepage </a>");
	
	writer.print("</h3>");
	writer.print("</body");
	writer.print("</html>");
	}

}
