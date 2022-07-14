package springpop;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Appp 
{
	static ApplicationContext ctx=new ClassPathXmlApplicationContext("/springpop/config.xml");
	static Empdao objdao=(Empdao) ctx.getBean("empdat");
	
	public static boolean checklogin(String name,String pass)
	{
		
		Employee ee=objdao.getEmployee(name);
		if(name.equals(ee.getEname()) && pass.equals(ee.getPassword()))
		{
			return true;
		}
		else
		{
			return false;
		}

	}

	public static void main(String[] args) {
		
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("/springpop/config.xml");
	
	Empdao objdao=(Empdao) ctx.getBean("empdat");
	
	//Set data
	Employee obje=new Employee();
//	obje.setEmpid(2);
//	obje.setEname("omk");
//	obje.setPassword("yoyo");
//	int insert=objdao.insert(obje);
//	System.out.println("employee inserted");
	
	

	


	
	
	}
	
	
	
	

}
