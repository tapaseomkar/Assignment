package Seven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main(String[] args)
	
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		First objf=(First) ctx.getBean("First");
		objf.result();
		
	}

}
