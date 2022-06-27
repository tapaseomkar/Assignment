package Assignments;

import java.util.Scanner;

public class Fourteen
{
	//....................................
	public void p1(String str,int n1,int n2)
	{
		if(n1==n2)
		{
			System.out.println(str);
		}
		else
		{
			for(int i=n1;i<=n2;i++)
			{
				str=swap(str,n1,i);
				p1(str,n1+1,n2);
				str=swap(str,n1,i);
			}
		}
		
	}
	public String swap(String s,int i,int j)
	{
		char temp;
		char[] charArray=s.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
	}
	
	public static <Permutation> void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabetical");
		String ss=sc.next();
		int length=ss.length();
		Fourteen fr=new Fourteen();
		fr.p1(ss, 0, length-1);
		
	   
		
	}

}