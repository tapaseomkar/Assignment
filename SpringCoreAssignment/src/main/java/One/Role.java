package One;

public class Role 
{
	
	private Role()
	{
		
	}
	public static Role getObjA()
	{	 
		 return new Role();
	}
	public void show()
	{
		 System.out.println(" Role based Object is created");	 		
	}

}

