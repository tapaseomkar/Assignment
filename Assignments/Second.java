package Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Second 
{
	//.................
	public static void main(String[] args) 
	{
		List<Integer>obj=Arrays.asList(34,87,87,78,78);
		obj.stream().distinct().forEach(System.out::println);
		
		//using distinct ..
	}

}
