package Assignments;

public class Thirteen 
{
	public static void main(String[] args)
	{
		//....................................
		int arr[]= {1,2,3,6,7,8,9,10,11,12,13,14,17,18,19,20};
		for(int i=0;i<arr.length;i++)
		{
			if(i<=4)
			{
				String a=arr[i]+"-"+(arr[i+2]);
				System.out.println(a+",");
				i=i+2;
			}else if(i<=10)
			{
				String a=arr[i+1]+"-"+(arr[i+5]);
				System.out.println(a+",");
				i=i+4;
			}else {
				String a=arr[i+1]+"-"+(arr[i+4]);
				System.out.println(a);
				System.out.println(" ");
				i=i+4;
			}
			
		}
		
		
		
	}

}
