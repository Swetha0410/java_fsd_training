package com.ust1;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter obj = res.getWriter();
		obj.println("<html>");
		obj.println("<body>");
		obj.println("<head> HI </head>");
		obj.println("</body>");
		obj.println("</html>");
	}

}
