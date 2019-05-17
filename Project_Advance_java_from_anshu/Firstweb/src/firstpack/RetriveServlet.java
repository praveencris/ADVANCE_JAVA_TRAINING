package firstpack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RetriveServlet")
public class RetriveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RetriveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		employee e=new employee();
		e.setEmpid(1000);
		e.setName("jitu");
		e.setSalary(50000);
		System.out.println("Details "+e.getEmpid()+ " "+e.getSalary()+" "+e.getName()+" ");
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
