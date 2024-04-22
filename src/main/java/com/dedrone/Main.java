package com.dedrone;

import java.util.HashMap;
import java.util.Map;

public class Main {

	private static final String MAPKEY = "key";

	private enum MyEnum {
		FOO, BAR, BAZ;
	}

	public static void main(final String[] args) {
		final MyEnum e = MyEnum.FOO;
		printEnumHumanReadable(e);
		printEnumHumanReadableV2(e);

		final Map<String, Integer> myMap = new HashMap<>();
		printInt(myMap.get(MAPKEY));
	}

	/**
	 * Prints the given MyEnum value in a human-readable format.
	 *
	 * @param value The MyEnum value to be printed.
	 */
	private static void printEnumHumanReadable(final MyEnum value) {
		if (value == MyEnum.FOO) {
			System.out.println("It is FOO");
		} else if (value == MyEnum.BAR) {
			System.out.println("It is BAR");
		}
	}

	/**
	 * Prints the given MyEnum value in a human-readable format.
	 *
	 * @param value The MyEnum value to be printed.
	 */
	private static void printEnumHumanReadableV2(final MyEnum value) {

		if (value == MyEnum.FOO) {
			System.out.println("check 1 - It is FOO");
		} else {
			System.out.println("check 1 - It is not FOO");
		}

		if (value.toString() == MyEnum.FOO.toString()) {
			System.out.println("check 2 - It is FOO");
		} else {
			System.out.println("check 2 - It is not FOO");
		}

		if (value.toString() == "FOO") {
			System.out.println("check 3 - It is FOO");
		} else {
			System.out.println("check 3 - It is not FOO");
		}

		if (value.toString() == new String("FOO")) {
			System.out.println("check 4 - It is FOO");
		} else {
			System.out.println("check 4 - It is not FOO");
		}

	}

	/**
	 * Prints the given integer value to the console.
	 *
	 * @param a The integer value to be printed.
	 */
	private static void printInt(final int a) {
		System.out.println(a);
	}

	/**
	 * Calculates the sum of two integers.
	 *
	 * @param a The first integer.
	 * @param b The second integer.
	 * @return The sum of a and b.
	 */
	public static int intSumV1(int a, int b) {
		a + b;
	}

	/**
	 * Calculates the sum of two integers.
	 *
	 * @param a The first integer.
	 * @param b The second integer.
	 * @return The sum of a and b.
	 */
	public static int intSumV2(int a, int b) {
		a++ + b++;
	}

	/**
	 * Calculates the sum of two integers.
	 *
	 * @param a The first integer.
	 * @param b The second integer.
	 * @return The sum of a and b.
	 */
	public static int intSumV3(int a, int b) {
		++a + ++b;
	}

	/**
	 * Creates a map with specified number of entries.
	 *
	 * @param count The number of entries to create in the map.
	 * @return The map with the specified number of entries.
	 */
	public static Map<String, String> createMap(final int count) {
		final Map<String, String> result = new HashMap<>();
		for (int i = 0; i < count; i++) {
			result.put(MAPKEY + i, MAPKEY + i);
		}
		return result;
	}

}
