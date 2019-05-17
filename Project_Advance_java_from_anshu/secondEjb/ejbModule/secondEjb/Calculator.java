package secondEjb;
import javax.annotation.*;
import  javax.ejb.Stateless;
@Stateless(mappedName="calculatorc")




public class Calculator implements CalculaterRemote{

public void dollortors(int amount)

{
	
System.out.println("coming here");
int amt=amount*60;
System.out.println("hello" + amt);
}
	
	
	
}
