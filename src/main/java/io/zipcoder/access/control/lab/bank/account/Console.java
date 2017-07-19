package io.zipcoder.access.control.lab.bank.account;

import java.util.Scanner;

public class Console {
	private static final Scanner scanner = new Scanner(System.in);

	public static void println(String string) {
		System.out.println(string);
	}

	public static String getStringInput(String string) {
		println(string);
		String input = scanner.nextLine();
		return input;
	}

	public static Double getDoubleInput(String string) {
		String stringInput = getStringInput(string);
		double doubleInput = Double.parseDouble(stringInput);
		return doubleInput;
	}

	public static int getIntInput(String string) {
		return getDoubleInput(string).intValue();
	}

	public static AccountStatus getAccountStatus(String string) {
		String
		return null;
	}

}
