package Eleven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	void test() 
	{
		Singleton st1=Singleton.getSingleton();
		Singleton st2=Singleton.getSingleton();
		assertTrue(SingletonCheck.checkingsingleton(st1, st2));
		
	}

}
