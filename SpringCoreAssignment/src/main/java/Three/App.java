package Three;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args)
	{
		ApplicationContext obj = new ClassPathXmlApplicationContext("config.xml");
		Emi e1=(Emi) obj.getBean("questt");
		System.out.println("interest rate "+e1.rate +"%");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount");
		float amount= sc.nextFloat();
		
		System.out.println("enter validity in years");
		int validity= sc.nextInt();
		int validityinmonts=validity*12;
		
		double TPA= amount+ ((amount*e1.rate)/100) * validity;
		System.out.println("total payble amount "+TPA);
		
		double emi =TPA/validityinmonts;
		System.out.println("EMI for toal amount "+ emi);
		
	}
	

}
