package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Seven 

{
	public static void main(String[] args) {
		
		List<Item>aslist=new ArrayList();
		aslist.add(new Item(1,"pen",1200));
		aslist.add(new Item(2,"tablet",1500));
		aslist.add(new Item(3,"phone",8900));
		List<Float>check=aslist.stream().filter(w->w.price%2==0).map(w->w.getPrice()).toList();
		System.out.println("even number are: "+check);
		
		
	}

}
