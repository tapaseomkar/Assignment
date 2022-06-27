package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;


public class Nine 
{
	//.....................................
	public static void main(String[] args)
	{
		int even=0;
		int odd=0;
		Scanner sc=new Scanner(System.in);
		List<Integer> obj=Arrays.asList(2,4,6);
		
		
		Predicate<Integer>prd=p->(p%2==0);
				
		for(int i=0;i<obj.size();i++)
		{
			if(prd.test(obj.get(i))==true)
			{
				even++;
			}
			else
			{
				odd++;
			}
		
		}
		System.out.println(even);
		System.out.println(odd);
		
		
		
		
	}

}

