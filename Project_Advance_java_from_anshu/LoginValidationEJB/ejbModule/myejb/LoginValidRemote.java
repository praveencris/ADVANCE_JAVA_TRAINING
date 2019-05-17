package myejb;
import javax.ejb.*;
@Remote
public interface LoginValidRemote {
	public boolean checkLogin(String login,String pass);

}
