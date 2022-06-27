package Assignments;

public class Fifteen 
{
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("hii");
		int arr[]= {4,3,5,12,13,5,9,3,8};
		
		for(int i=0;i<=arr.length-3;i++)
		{
		int a=arr[i]*arr[i];
		int b=arr[i+1]*arr[i+1];
		int c=arr[i+2]*arr[i+2];
		
		if(a == b+c || b == a+c || c == a+b )
		{
			System.out.println(arr[i]+" "+arr[i+1]+" "+arr[i+2]);
		}
		
		}
		
		
	}

}
