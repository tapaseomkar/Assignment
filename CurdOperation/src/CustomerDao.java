

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerDao
{

	private List<Customer> cl=new ArrayList<>();
	
	//save
	public void saveCustomer(Customer cs1)
	{
		cl.add(cs1);
	}
	
	//display
	public Customer getCustomer(int id)
	{
		for(Customer cs:cl)
		{
			if(cs.getCustomerid()==id)
			{
				return cs;
			}
		}
		return null;
	}
	
	public void updateCustomer(int id, String name)
	{
		for(Customer cs:cl)
		{
			if(cs.getCustomerid()==id)
			{
				cs.setName(name);
			}
			
		}
		System.out.println("CUSTOMER UPDATE");
	}
	public void displayAll()
	{
		for(Customer cs:cl)
		{
			System.out.println(cs);
		}
	}
	
	public void delete(int id)
	{
		for(Customer cs:cl)
		{
			if(cs.getCustomerid()==id)
			{
				cl.remove(id);
			}
		}
		System.out.println("CUSTOMER DELETED");
	}
	
	public static void main(String[] args)
	{
		CustomerDao dao=new CustomerDao();
		
		Customer customer1 =new Customer(11,"kalyani",2000);
		Customer customer2 =new Customer(12,"mohan",1000);
		Customer customer3 =new Customer(13,"komal",12000);
		Customer customer4 =new Customer(14,"rohit",12000);
		Customer customer5 =new Customer(15,"mohan",16000);
		Customer customer6 =new Customer(16,"nil",15000);
		Customer customer7 =new Customer(17,"pia",1500);
		
		//SAVE CUSTOMER
		dao.saveCustomer(customer1);
		dao.saveCustomer(customer2);
		dao.saveCustomer(customer3);
		dao.saveCustomer(customer4);
		dao.saveCustomer(customer5);
		dao.saveCustomer(customer6);
		dao.saveCustomer(customer7);
		
		//DISPLAY
		//System.out.println(dao.getCustomer(14));
		//System.out.println("------------------");
		
		
		
		//UPDATE
		//dao.updateCustomer(12,"lol");
		//System.out.println("------------------");
		
		
		
//		dao.delete(14);
//		System.out.println("--------------------");
		
		
		
		//DISPLAYALL
		//dao.displayAll();
	}
	
	
	


}
