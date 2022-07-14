package springpop;

public class Employee 
{
	int empid;
	String ename;
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", password=" + password + "]";
	}
	public Employee() {
		super();
	}
	public Employee(int empid, String ename, String password) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.password = password;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	String password;

}
