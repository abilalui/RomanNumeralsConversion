import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RomanNumeralsTest {

	String[] array = {"MA", "MB", "I", "L", "X", "C" };
	RomanNumerals romanNum = new RomanNumerals();
	
	// Tests for included method
	@Test
	void testIncluded() {
		assertTrue(romanNum.included("I", array));
	}
	
	
	
	// Tests for moreThanThreeConsecutiveCharacters method
	@Test
	void moreThanThreeConsecutiveCharacters_stringHaveMoreThanThreeConsecutiveCharacters() {
		assertTrue( romanNum.moreThanThreeConsecutiveCharacters( "XXXX" ) ); 
	}
	
	@Test
	void moreThanThreeConsecutiveCharacters_StringHaveMoreThanThreeConsecutiveCharsNotAtFirstChar() {
		assertTrue( romanNum.moreThanThreeConsecutiveCharacters( "BXXXX" ) ); 
	}
	
	@Test 
	void moreThanThreeConsecutiveCharacters_stringLengthIsThree() {
		assertFalse( romanNum.moreThanThreeConsecutiveCharacters( "mmm" ) );
	}
	
	@Test 
	void moreThanThreeConsecutiveCharacters_stringLengthIsThreeOfDifferentCharacters() {
		assertFalse( romanNum.moreThanThreeConsecutiveCharacters( "abc" ) );
	}
	
	@Test 
	void moreThanThreeConsecutiveCharacters_stringLengthIsTwo() {
		assertFalse( romanNum.moreThanThreeConsecutiveCharacters( "mm" ) );
	}
	
	@Test 
	void moreThanThreeConsecutiveCharacters_stringLengthIsOne() {
		assertFalse( romanNum.moreThanThreeConsecutiveCharacters( "m" ) );
	}
	
	@Test 
	void moreThanThreeConsecutiveCharacters_stringLengthIsZero() {
		assertFalse( romanNum.moreThanThreeConsecutiveCharacters( "" ) );
	}
	
	
	
	

}
