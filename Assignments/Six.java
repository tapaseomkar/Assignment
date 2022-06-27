package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Six 
{
	public static void main(String[] args)
	{
		List<Item>aslist=new ArrayList();
		aslist.add(new Item(1,"pen",1200));
		aslist.add(new Item(2,"tablet",1500));
		aslist.add(new Item(3,"phone",8900));
		Double avg=aslist.stream().collect(Collectors.averagingDouble(e->e.price));
		
		System.out.println("Average number is "+avg);
		List<Item> minavg=aslist.stream().filter(e1->e1.price <avg).map(e1->e1).toList();
		
		for(Item a:aslist)
		{
			System.out.println(a.name+" "+a.price);
		}
		
		
		
	}

}
