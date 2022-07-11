package Fourteen;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/Fourteen/config14.xml");
		Circle cj=(Circle) ctx.getBean("que14");
		Square sq=(Square) ctx.getBean("que14a");
		Rectangle re=(Rectangle) ctx.getBean("que14b");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice: ");
		
		String ch=sc.next();
		switch(ch)
		{
		case "Circle":
			cj.area(11);
			cj.side();
			break;
			
		case "Square":
			sq.area(5);
			sq.side();
			break;
			
		case "Rectangle":
			re.area(2,4);
			re.side();
			break;
			default: System.out.println("Enter valid");
			
		}
		
		
		
	}

}
