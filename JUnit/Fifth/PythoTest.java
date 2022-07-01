package Fifth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Fourth.ArmSt;

class PythoTest {

	@Test
	public void test() 
	{
		boolean a1=true;
		boolean a2=false;
		assertEquals(a1,Pytho.checkPy(6, 8, 10));
	}

}
