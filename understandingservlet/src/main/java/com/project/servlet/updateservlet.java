package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class updateservlet extends HttpServlet {
	public updateservlet() {
		System.out.println("object is created:"+this.getClass().getName());
		}
	@Override
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("updateservlet.service()");
	response.setContentType("text/html");
	PrintWriter writer=response.getWriter();
	writer.print("<html>");
	writer.print("<body");
	writer.print("<h1>");
	writer.print("This is my update link");
	writer.print("</h1>");
	writer.print("<h3> <a href=http://localhost:8086/understandingservlet/> click to homepage </a>");
	
	writer.print("</h3>");
	writer.print("</body");
	writer.print("</html>");
	}

}
