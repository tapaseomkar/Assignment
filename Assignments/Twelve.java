package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Twelve 
{
	public static void main(String[] args)
	{
		List<Integer>slist=new ArrayList<Integer>();
		Max u=(int a[])->
		{
			for(int i=0;i<a.length;i++)
					{
				slist.add(a[i]);
					}
			Integer maxnumber=slist.stream().max((e1,e2)->e1>e2 ? 1:-1).get();
			System.out.println("max number in array is :"+maxnumber);
		};
		u.maxArray(new int[] {76,898,876,56,78});
		
		
	}

}
