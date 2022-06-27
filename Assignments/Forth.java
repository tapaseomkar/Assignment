package Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Forth 
{
	//..........................
	public static void main(String[] args) 
	{
		
		List<Integer>list=Arrays.asList(34,65,87,78,98);
		
		Integer max=list.stream().max(Integer::compare).get();
		System.out.println("max number of list is: "+max);
		
	}

}

