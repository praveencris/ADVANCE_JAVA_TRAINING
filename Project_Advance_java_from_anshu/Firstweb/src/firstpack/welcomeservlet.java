package firstpack;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;


public class welcomeservlet extends HttpServlet {
	RequestDispatcher dis=null;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
		
		HttpSession ses1=request.getSession(false);
		String logval=(String)ses1.getAttribute("loginval");
		out.println("session variable is" + logval);
		
		
//		
//		// String val=(String)request.getAttribute("name");
//		employee val =(employee)request.getAttribute("name");
//		
//		
//		//String val= request.getParameter("name");
//		val.display();
//		 out.println(val);
//		
//		out.println("other servlet");
		
		
	
	}

}
