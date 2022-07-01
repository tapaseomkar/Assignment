package Eight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrTest {

	@Test
	void test() {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		assertEquals(4, EvenNoOfArray.countingEven(arr));
		assertEquals(5, EvenNoOfArray.countingOdd(arr));
	}

}
