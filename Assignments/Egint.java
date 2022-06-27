package Assignments;

import java.util.Scanner;
import java.util.function.Predicate;

public class Egint 
{
	//.........................................
	public static boolean check(int no)
	{
		Predicate<Integer>prd=p->(p%2==0);
		return prd.test(no);
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no=sc.nextInt();
		
		/*
		 * Predicate<Integer>prd=p->(p%2==0); System.out.println(prd.test(no));
		 */
		if(Egint.check(no)==true)
		{
			System.out.println("No is Even");
		}else
		{
			System.out.println("No is Odd");
		}
	
	}

}
