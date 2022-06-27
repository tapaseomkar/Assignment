package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Ten 
{
	public static void main(String[] args) 
	{
		
		{
	        List<Employe> employeeList = new ArrayList<>();
	        employeeList.add(new Employe(1, "simran"));
	        employeeList.add(new Employe(2, "rohan"));
	        employeeList.add(new Employe(3, "ketki"));
	        employeeList.add(new Employe(4, "Dev"));
	        employeeList.add(new Employe(5, "Elegent"));
	        employeeList.add(new Employe(6, "mohan"));
	        employeeList.add(new Employe(7, "rohit"));
	        employeeList.add(new Employe(8, "harsh"));
	        employeeList.add(new Employe(9, "joship"));
	        employeeList.add(new Employe(10, "kevin"));

	        System.out.println("====Converting list to map====");
	        Map<Integer, String> map = employeeList.stream().collect(Collectors.toMap(E1->E1.getId(), E2->E2.getName()));
	        System.out.println(map);

	        System.out.println("====Converting list to set====");

	        Set<Employe> Set = employeeList.stream().collect(Collectors.toSet());
	        for (Employe emp : Set)
	            System.out.println("Employee id = " + emp.id + " Employee name = " + emp.name);
	    }
		
	}

}
