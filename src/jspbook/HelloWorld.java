package jspbook;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {

	public void goGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello World </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello World!</h1>");
		out.println("</body>");
		out.println("</html>");

	}

}
