package Fifteen;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) 
	{
		List<Customer>slist=new ArrayList<Customer>();
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/Fifteen/Config15.xml");
		Customer c=(Customer) ctx.getBean("CustID");
		c.display();
	}

}
