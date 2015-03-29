package mainPackage;

import java.util.Scanner;

public class CreditCardCheckDigit {
	public static void main(String[] args) {
		java.util.Scanner input = new Scanner(System.in);

		// Enter Credit Card number
		System.out.print("Credit Card Number: ");
		String ccNumber = input.next();

		input.close();

		if (LuhnAlgorithmCheck(ccNumber) == true) {
			System.out.print("The credit card is valid");
		} else {
			System.out.print("The credit card is invalid");
		}
	}

	public static boolean LuhnAlgorithmCheck(String ccNumber) {
		int sum = 0;
		boolean alternate = false;
		for (int i = ccNumber.length() - 1; i >= 0; i--) {
			int n = Integer.parseInt(ccNumber.substring(i, i + 1));
			if (alternate) {
				n *= 2;
				if (n > 9) {
					n = (n % 10) + 1;
				}
			}
			sum += n;
			alternate = !alternate;
		}
		return (sum % 10 == 0);
	}
}
