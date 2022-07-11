package Eight;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Items obji=(Items) ctx.getBean("ii");
		obji.ascending();
		System.out.println("................");
		obji.descending();
		System.out.println("..............");
		obji.duplicate();
				
		
		
		
	}

}
