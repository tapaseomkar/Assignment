package Assignments;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sixteen 
{
	String itemname;
	LocalDate dom;
	double price;
	String category;
	LocalDate doe;
	
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public LocalDate getDom() {
		return dom;
	}
	public void setDom(LocalDate dom) {
		this.dom = dom;
	}
	public LocalDate getDoe() {
		return doe;
	}
	public void setDoe(LocalDate doe) {
		this.doe = doe;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "Sixteen [itemname=" + itemname + ", dom=" + dom + ", doe=" + doe + ", price=" + price + ", category="
				+ category + "]";
	}
	public Sixteen(String itemname, LocalDate dom, LocalDate doe, double price, String category) {
		super();
		this.itemname = itemname;
		this.dom = dom;
		this.doe = doe;
		this.price = price;
		this.category = category;
	}
	
	public static void main(String[] args) 
	{
		
		
		List<Sixteen> ilist=new ArrayList();
		ilist.add(new Sixteen("bag",LocalDate.of(2022,3,03),null,1000,"personal"));
		ilist.add(new Sixteen("Tie",LocalDate.of(2022,3,12),null,200,"personal"));
		ilist.add(new Sixteen("Laptop",LocalDate.of(2022,5,03),null,1000,"electronics"));
		ilist.add(new Sixteen("Oil",LocalDate.of(2022,3,03),LocalDate.of(2025, 5, 02),180,"food"));
		ilist.add(new Sixteen("chips",LocalDate.of(2022,3,03),LocalDate.of(2022, 5, 05),50,"personal"));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the category:-----");
		String cag=sc.next();
		ilist.stream().filter(e->e.category.equals(cag)).forEach(System.out::println);
		
		System.out.println("Enter starting letter of the item:-----");
		String start=sc.next();
		char ch=start.charAt(0);
	    ilist.stream().filter(e->e.itemname.startsWith(start.toLowerCase())).forEach(System.out::println);
	    
	   
		
//		 SimpleDateFormat dateForm=new SimpleDateFormat("yyyy/mm/dd");
//		 System.out.println("enter the date:................"); String d=sc.next();
//		 dateForm.format(d); ilist.stream().filter(e->e.dom.(dateForm.format(d)))
//		 .forEach(System.out::println);
		 
	    
	   
	    
	    

	   
	    
	    
		
		
		
	
		
		
		
	}
}
