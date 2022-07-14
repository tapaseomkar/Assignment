package springpop;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class Empdao
{
	private JdbcTemplate objJdbc;
	

	public void setObjJdbc(JdbcTemplate objJdbc) {
		this.objJdbc = objJdbc;
	}
	
	
	public int insert(Employee emp)
	{
		String query="insert into employee(eid,ename,password)values(?,?,?)";
		int update=objJdbc.update(query,emp.getEmpid(),emp.getEname(),emp.getPassword());
		return update;
	}
	
	public Employee getEmployee(String ename)
	{
		String query="select * from employee where ename=?";
		RowMapper<Employee> rowMapper = new rowmap(); //RowMapper-> Implementation class i.e imple
		Employee qfo = objJdbc.queryForObject(query,rowMapper,ename);
		return qfo;
	}
 
}
