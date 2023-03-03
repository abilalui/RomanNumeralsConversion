

public class RomanNumerals {

	
	// Array that contains all valid one and two letter combinations of Roman numerals.
	String[] romanNumerals = new String[] { "M", "CM", "D", "CD", "C", "XC", "L",
										    "XL", "X", "IX", "V", "IV", "I"      
						   														  };
	
	// An array that contains all equivalent corresponding Arabic values to the Roman numerals in RomanNumerals
	// array. Values equivalence between these two arrays are based on their order. for example equivalent Arabic
	// value to the first element of romanNumerals array is the first element of arabicNumbers array. 
	int[] arabicNumers = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	
	
	/**
	 * A method to check if the given string is inside the given array
	 * @param str   	a string to be checked if is included inside the array
	 * @param array[] 	an array to be searched if the given string is inside the array
	 * @return return true if the given string is inside the given array otherwise return false. 
	 */
	public boolean included( String str, String array[] ) {
		
		for ( int i = 0; i < array.length; i++ ) {
			if ( array[i].equals( str ) ) {
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * A method to check if there are more than three similar consecutive characters in the given string. 
	 * @param str  a string to be checked if it has more than three same consecutive characters.
	 * @return     returns true if there are more than three similar consecutive characters in a string, 
	 * 			   otherwise returns false. 
	 */
	public boolean moreThanThreeConsecutiveCharacters( String str ) {
		
		// Checking str for having three consecutive characters 
		while ( str.length() > 3 ) {
			
			if ( str.charAt(0) == str.charAt(1) && str.charAt(0) == str.charAt(2) &&
				 str.charAt(0) == str.charAt(3) ) {
				return true;
			}
			
			if ( str.charAt(0) == str.charAt(1) && str.charAt(0) == str.charAt(2)) {
				str = str.substring(2);
				break;
			}
			
			if ( str.charAt(0) == str.charAt(1) ) {
				str = str.substring(1);
				break;
			}
			
			str = str.substring(1);
		}
		
		return false;
	}
	
	
	/**
	 * A method that determine whether a given string is a valid 
	 * or invalid Roman numeral. 
	 * 
	 * @param str a String to be determined if it is a valid Roman Numeral number.
	 * @return    return true if the string is a valid Roman Numerals otherwise 
	 * 			  return false. 
	 */
	/*
	 * 
	 * rules for valid Roman numeral
	 * 	i)  numerals must be arranged in descending order of size.
	 * ii)  M, C, and X cannot be equalled or exceeded by smaller denomination 
	 * iii) D, L, and V can each only appear once. 
	public boolean isRomanNumeral( String str ) {
		
		if ( str.equals( "" ) ) {
			return false;
		} 
		
		int i = 0;
		while ( i < str.length() ) {
			
		}
		
		
	}
	*/
	
	public static void main( String args[] ) {
		RomanNumerals romanNum = new RomanNumerals();
		
		System.out.println( "Main method starts: " );
	} 
	
}
