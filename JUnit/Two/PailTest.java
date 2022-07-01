package Two;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PailTest {

	@Test
	void test() {
		String s1="ili";
		String s2="ili";
		assertEquals(true, Paild.checkP(s1,s2));
	}

}
