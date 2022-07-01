package First;

public class Hcf 
{
	
	public static int checkHcl(int n1,int n2)
	{
		int result=0;
		for(int i=1;i<=n1 || i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				result=i;
			}
		}
		return result;
		
	}
	public static void main(String[] args) 
	{

		
	}

}
