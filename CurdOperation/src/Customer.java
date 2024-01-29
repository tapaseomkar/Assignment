

public class Customer 
{
	private int customerid; 
	private String name;
	private int billAmount;
	public Customer(int customerid, String name, int billAmount) {
		super();
		this.customerid = customerid;
		this.name = name;
		this.billAmount = billAmount;
	}
	
	public Customer() {
		super();
	}

	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", name=" + name + ", billAmount=" + billAmount + "]";
	}
	
	
	
	
	

}
