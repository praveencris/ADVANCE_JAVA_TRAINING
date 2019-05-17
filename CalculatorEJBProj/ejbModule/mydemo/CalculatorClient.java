package mydemo;
import java.util.Hashtable;
public class CalculatorClient {
public static void main(String[] args) {
	Hashtable env=new Hashtable();
	env.put("java.naming.factory.initial", "weblogin.jndi.WLInitialContextFactory")
	
}
}
