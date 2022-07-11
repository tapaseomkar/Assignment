package Twelve;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OnBHighestSal
{
	public static void main(String[] args) 
	{
		List<Employee>slist=new ArrayList<Employee>();
		ApplicationContext ctxobj = new ClassPathXmlApplicationContext("config.xml");
		
		Employee c1 = (Employee) ctxobj.getBean("quea");
		Employee c2 = (Employee) ctxobj.getBean("queb");
		Employee c3 = (Employee) ctxobj.getBean("quec");
		Employee c4 = (Employee) ctxobj.getBean("qued");
		
		slist.add(c1);
		slist.add(c2);
		slist.add(c3);
		slist.add(c4);
		
		Employee max=slist.stream().max((e1,e2)->e1.salary>e2.salary? 1 :-1).get();
		System.out.println(max.toString());
		System.out.println("...............................");
		Double avg=slist.stream().collect(Collectors.averagingDouble(e->e.salary));
		System.out.println("Average number is"+avg);
        List<Employee> minimumavg= slist.stream().filter(i->i.salary< avg).toList();
        for(Employee a:minimumavg) 
          {
          	
          	System.out.println(a.ename+" "+a.salary);
          }
          System.out.println("============================");
          List<String > department=slist.stream().map(r->r.dept).distinct().toList();
      	for(String d:department) {
      		Double avg1=slist.stream().filter(e->e.dept.equals(d)).collect(Collectors.averagingDouble(e->e.salary));
      	System.out.println("Avarage Salary = "+avg1+" = Department = "+d);
		
		
		
	}

	}
}
