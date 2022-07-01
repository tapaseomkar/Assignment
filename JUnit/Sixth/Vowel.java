package Sixth;

import java.util.Scanner;

public class Vowel 
{
	public static int checkVowel(String s)
	{
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch== 'i' || ch=='o'|| ch=='u' )
			{
				count++;
			}
		}
		return count;	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(Vowel.checkVowel("hello"));
	}

}


