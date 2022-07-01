package Eight;

public class EvenNoOfArray 
{
	public static int countingEven(int arr[])
	{
		int even=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
			{
				even++;
			}
			
			}
		return even;
	}
	public static int countingOdd(int arr[])
	{
		int odd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
			{
				odd++;
			}
		}
		return odd;
	}
}

