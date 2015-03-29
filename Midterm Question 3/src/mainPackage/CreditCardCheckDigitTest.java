package mainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreditCardCheckDigitTest {

	@Test
	public void testtrueLuhnAlgorithmCheck() {
		assertTrue(
				"Checks to see if the cc number is valid according to Luhn's Algorithm",
				CreditCardCheckDigit.LuhnAlgorithmCheck("4388576018410707"));
	}

	@Test
	public void testfalseLuhnAlgorithmCheck() {
		assertFalse(
				"Checks to see if the cc number is valid according to Luhn's Algorithm",
				CreditCardCheckDigit.LuhnAlgorithmCheck("4388576018402626"));
	}
}
