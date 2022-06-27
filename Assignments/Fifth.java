package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Fifth 
{
	//.............................................
	public static void main(String[] args)
	{
		String[]a= {"ldfsa","dfhsd","kufdhks"};
		List<Integer>slist=new ArrayList<Integer>();
		for(String g:a)
		{
			int temp=0;
			char[]b=g.toCharArray();
			for(char ch:b)
			{
				temp++;
			}
			slist.add(temp);
		}
		Integer Maxmimum=slist.stream().max((e1,e2)->e1>e2 ?1:-1).get();
		int index=slist.indexOf(Maxmimum);
		System.out.println("Maximum length of name is "+a[index]+" length is= "+Maxmimum);
		
		
		
	}

}

