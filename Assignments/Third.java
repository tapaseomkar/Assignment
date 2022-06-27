package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Third 
{
	//....................................
	public static void main(String[] args)
	{
		List<String>obj=new ArrayList<String>();
		obj.add("nikhil");
		obj.add("santosh");
		obj.add("alex");
		obj.add("jhon");
		obj.add("mark");
		List<String> a=obj.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(a);
		
		
		
	}

}
