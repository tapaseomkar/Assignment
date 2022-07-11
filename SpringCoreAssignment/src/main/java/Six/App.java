package Six;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Vowel vv=(Vowel) ctx.getBean("vow");
		System.out.println("Names without vowel in it---");
		vv.check();
	}

}
