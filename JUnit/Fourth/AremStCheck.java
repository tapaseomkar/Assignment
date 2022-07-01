package Fourth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AremStCheck {

	@Test
	void testArmStrongOrNot() {
		boolean ans=true;
		boolean ans2=false;
	
		assertEquals(ans,ArmSt.isArmstring(153));
	}

}
