package Fifteen;

public class Customer 
{
	int id;
	String customerName;
	Iteam iteam;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Iteam getIteam() {
		return iteam;
	}
	public void setIteam(Iteam iteam) {
		this.iteam = iteam;
	}
	
	public void display()
	{
		System.out.println("Id is: "+id);
		System.out.println("Customer name: "+customerName);
		System.out.println("Iteam id: "+iteam.id);
		System.out.println("Iteam name: "+iteam.name);
		System.out.println("Iteam Price: "+iteam.price);
		System.out.println("Category name: "+iteam.cat.categoryname);
		
		
	}


}
