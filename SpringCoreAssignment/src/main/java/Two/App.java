package Two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext obj = new ClassPathXmlApplicationContext("config.xml");

		Average objg = (Average) obj.getBean("que2");
		objg.avegno();
		
		
		
	}

}
