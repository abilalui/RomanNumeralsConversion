import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RomanNumeralsTest {

	String[] array = {"MA", "MB", "I", "L", "X", "C" };
	RomanNumerals romanNum = new RomanNumerals();
	@Test
	void testIncluded() {
		assertTrue(romanNum.included("I", array));
	}
	


}
