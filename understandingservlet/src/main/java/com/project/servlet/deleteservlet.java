package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class deleteservlet extends HttpServlet {
	public deleteservlet() {
		System.out.println("objact is created:"+this.getClass().getName());
		
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("deleteservlet.service()");
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("This is my delete link ");
		writer.print("</h1>");
		writer.print("<h3> <a href=http://localhost:8086/understandingservlet/> click to homepage </a>");
		writer.print("</body>");
		writer.print("</html>");
		
	}

}
