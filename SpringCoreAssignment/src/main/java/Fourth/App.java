package Fourth;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Employee ee=(Employee) ctx.getBean("emp");
		ee.show();
		
		
	}
}
