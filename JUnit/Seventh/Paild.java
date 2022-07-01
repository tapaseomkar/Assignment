package Seventh;

public class Paild 
{
	public static boolean checkPal(int no)
	{
		int temp=no;
		int rev=0,rem;
		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no/=10;
		}
		if(rev==temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
	
	public static void main(String[] args)
	{
		System.out.println(Paild.checkPal(123));
		
		
	}

}
