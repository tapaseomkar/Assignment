package Five;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args)
	{
		ApplicationContext objCTX = new ClassPathXmlApplicationContext("config.xml");
		 NumberOne obj1 = (NumberOne) objCTX.getBean("questF");
		 obj1.method(new int[] { 2, 6, 4, 6, 3, 22, 4, 5, 3, 3, 45 });
		
	}

}
