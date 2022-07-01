package First;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class HcfTest {

	
	@Test
	void test() {
		assertEquals(1,Hcf.checkHcl(2, 3));
	}

}
