package Fifteen;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class ItemTest {

	@Test
	void test() {
		  Item i=new Item(333, "yoyo", 170, 150, LocalDate.of(2020, 12, 13), LocalDate.of(2022, 11, 17));
	        assertEquals(true,i.createObject(i));
	}

}
