package Eleven;

public class Singleton 
{
	private static Singleton st=new Singleton();
	
	private Singleton()
	{
		
	}
	public static Singleton getSingleton()
	{
		return st;
	}
	
}
class SingletonCheck
{
	public static boolean checkingsingleton(Singleton st1, Singleton st2)
	{
		if(st1.hashCode()==st2.hashCode())
		{
			return true;
		}
		return false;
	}
}

