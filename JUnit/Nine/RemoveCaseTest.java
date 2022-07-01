package Nine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveCaseTest {

	@Test
	void test() {
		assertEquals("This Red car",RemoveCase.check("This @Red $car-"));
	}

}
