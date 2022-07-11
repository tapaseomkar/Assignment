package Eight;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Items 
{
	List <String>item;

	public List getItem() {
		return item;
	}

	public void setItem(List item) {
		this.item = item;
	}

	public void ascending()
	{
		System.out.println(this.item);
		item.stream().sorted().forEach(System.out::println);
	}
	
	public void descending()
	{
		item.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}
	public void duplicate()
	{
		Set iset=item.stream().collect(Collectors.toSet());
		System.out.println(iset);
	}
	

}
