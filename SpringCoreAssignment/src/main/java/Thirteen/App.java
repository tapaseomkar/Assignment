package Thirteen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext obj = new ClassPathXmlApplicationContext("config.xml");
		System1 iobj=(System1) obj.getBean("cust");
		iobj.show();
		
	}

}
