import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import springpop.Appp;

class TestData {

	@Test
	void test() {
		Scanner sc=new Scanner(System.in);
		String s1;
		String s2;
		System.out.println("enter user name: ");
		s1=sc.nextLine();
		System.out.println("enter password : ");
		s2=sc.nextLine();
		assertEquals(true, Appp.checklogin(s1, s2));
	}

}
