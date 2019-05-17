package firstpack;

import javax.servlet.*;
import javax.servlet.http.*;


import java.io.*;


public class LoginServlet extends HttpServlet {
	
	RequestDispatcher dis=null;
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		PrintWriter out =res.getWriter();
		String login=req.getParameter("uname");
		String pass=req.getParameter("psw");
		if(login.equals("anshu") && pass.equals("anshu"))
		{
			
			
			HttpSession ses=req.getSession(true);
			ses.setAttribute("loginval",login);
			out.println("session id is "+ses.getId());
			
//	 dis = getServletContext().getRequestDispatcher("/welcome?name="+login+'"');
//			
//		//	dis = getServletContext().getRequestDispatcher("/welcome");
//		//	req.setAttribute("name", "Training");
//			
//			employee e =new employee(1,"Dimple");
//			req.setAttribute("name", e);
//		
//		
			
			
	// dis.forward(req, res);
	
	 out.println("Welcome swrvlet");
	
	
		}
else
{
	
	dis=getServletContext().getRequestDispatcher("/second.html");
	dis.include(req, res);
	out.println("invlid id or password");
	
	
		
		
		// doGet(req, res);
	}

}
}

