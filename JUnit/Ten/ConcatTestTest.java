package Ten;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcatTestTest {

	@Test
	void test() {
		String arr[]= {"apple","orange","banana","lemon"};
		assertEquals("apple-orange-banana-lemon", ConcatTest.check(arr));
	}

}
