package Five;

public class DefineC implements NumberOne
{

	@Override
	public void method(int[] a) {
		int max=a[0];
		for(int obj:a)
		{
			if(obj>max)
			{
				max=obj;
			}
		}
		System.out.println("Maximum number: "+max);
		
	}
	

}
