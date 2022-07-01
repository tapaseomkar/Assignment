package Sixth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VowelTest {

	@Test
	void testVowelCount() {
		
		String check="hii how are you";
		assertEquals(7,Vowel.checkVowel(check));
	}

}
