package Ten;

public class ConcatTest
{
	public static String check(String a[])
	{
		String s="";
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-1)
			{
				s+=a[i];
			}
			else
			{
				s+=a[i]+"-";
			}
		}
		return s;
	}
	public static void main(String[] args) {
		
	}
	
}
