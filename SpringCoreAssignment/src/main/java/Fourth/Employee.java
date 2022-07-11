package Fourth;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee 
{
	private int id;
	private String name;
	private long salary;
	
	@Autowired
	private Department depart;

	public Department getDepart() {
		return depart;
	}

	public void setDepart(Department depart) {
		this.depart = depart;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	
	
	public void show()
	{
		System.out.println("Name of the Empoyee is :"+name);
		System.out.println("Employee Id: "+id);
		System.out.println("Employee salary: "+salary);
		System.out.println("Department: "+depart.getDname());
		System.out.println("Location: "+depart.getLocation());
		
	}
	

}

