package secondpack;

import javax.servlet.*;
import javax.servlet.http.*;

import secondpack.secp;

import java.io.*;


public class bookservlet extends HttpServlet {
	
	RequestDispatcher dis=null;
	// protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			secp e=new secp();
			e.getBname();
			e.getBprice();
			
			
			
			
			System.out.println("Details "+e.getBname()+" "+e.getBprice()+" ");
			
			
//			HttpSession ses=req.getSession(true);
//			ses.setAttribute("loginval",login);
//			out.println("session id is "+ses.getId());
//			
//	 dis = getServletContext().getRequestDispatcher("/welcome?name="+login+'"');
//			
		//dis = getServletContext().getRequestDispatcher("/second");
//		//	req.setAttribute("name", "Training");
//			
//			employee e =new employee(1,"Dimple");
//			req.setAttribute("name", e);
//		
//		
			
			
	// dis.forward(req, res);
	
	// out.println("Welcome swrvlet");
	 
	 
		}
	}