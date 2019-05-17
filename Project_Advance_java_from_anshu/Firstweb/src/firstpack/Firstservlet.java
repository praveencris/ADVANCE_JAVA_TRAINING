package firstpack;

import javax.servlet.*;
import javax.servlet.http.*;

import antlr.PrintWriterWithSMAP;

import java.io.*;


public class Firstservlet extends HttpServlet
{
	@Override
public void  service(HttpServletRequest req ,HttpServletResponse res) throws ServletException, IOException
{
		

		
		PrintWriter out =res.getWriter();
		out.println("<font color=red><B><i><h1> Welcome to first servlet</font></h1> </B></i>");
		out.println("<form action=\"action_page.php\">\r\n" + 
				"  <div class=\"imgcontainer\">\r\n" + 
				"  </div>\r\n" + 
				"\r\n" + 
				"  <div class=\"container\">\r\n" + 
				"    <label for=\"uname\"><b>Username</b></label>\n" + 
				"    <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required>\r\n" + 
				"\n" + 
				"    <label for=\"psw\"><b>Password</b></label>\r\n" + 
				"    <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\r\n" + 
				"\r\n" + 
				"    <button type=\"submit\">Login</button>\r\n" + 
				"    <label>\r\n" + 
				"      <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me\r\n" + 
				"    </label>\r\n" + 
				"  </div>\r\n" + 
				"\r\n" + 
				"  <div class=\"container\" style=\"background-color:#f1f1f1\">\r\n" + 
				"    <button type=\"button\" class=\"cancelbtn\">Cancel</button>\r\n" + 
				"    <span class=\"psw\">Forgot <a href=\"#\">password?</a></span>\r\n" + 
				"  </div>\r\n" + 
				"</form>");
		
}




}

