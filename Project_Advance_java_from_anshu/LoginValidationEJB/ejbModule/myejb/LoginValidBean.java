package myejb;
import javax.ejb.*;
@Stateful(mappedName="LoginValid")
public class LoginValidBean implements 
LoginValidRemote {
	public boolean checkLogin(String user,String pass)
	{
		boolean res;
		if(user.equals("admin")&&pass.equals("admin"))		{
			res= true;
		}
		
		else
		{
			res=false;
		}
		return res;
	}

}
