package myservlet;
import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import myejb.*;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		String log=request.getParameter("login");
		String pass=request.getParameter("password");
		try
		{
		Context ic=new InitialContext();
		LoginValidRemote re=
(LoginValidRemote)ic.lookup
("LoginValid#myejb.LoginValidRemote");
		if(re.checkLogin(log, pass))
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
