package secondEjb;
import java.util.Hashtable;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;

public class CalculatorClient {
	
	public static void main(String arg[])
	{
		
		
		Hashtable env = new Hashtable();
		env.put("java.naming.factory.initial", "weblogic.jndi.WLInitialContextFactory");
		env.put("java.naming.provider.url","t3://localhost:7001");
		try
		{
			
			final Context context = new InitialContext(env);
			CalculaterRemote calc=(CalculaterRemote)
					context.lookup("calculatorc#secondEjb.CalculatorRemote");
			System.out.println("found");
			calc.dollortors(40);
		} 
		catch(Exception ex)
		
		
		{
			
			System.out.println("coming in exception");
			ex.printStackTrace();
			
		}
			
			
			
			
		}
		
		
		
	}
	

}
