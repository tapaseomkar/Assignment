package Eleven;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		
		Student s1=(Student) ctx.getBean("que11b");
		Student s2=(Student) ctx.getBean("que11d");
	
		List<Student>slist=new ArrayList<Student>();
		slist.add(s1);
		slist.add(s2);
		
		for(Student objs:slist)
		{
			System.out.println(objs.studentName+" "+objs.rs.total);
		}
		System.out.println("On Basis of Total Marks");
		List<Student> sortedlist = slist.stream().sorted((ss1, ss2) -> Double.compare(s1.rs.total, s2.rs.total)).toList();
		for (Student w : sortedlist) {
		System.out.println(w.rs.total);
		
		
		
		
		
		
		
		
				
		
		
	}

	}
}
