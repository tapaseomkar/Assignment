package springpop;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class rowmap implements RowMapper<Employee>

{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e=new Employee();
		e.setEmpid(rs.getInt(1));
		e.setEname(rs.getString(2));
		e.setPassword(rs.getString(3));
		return e;
	}
	
	

}
