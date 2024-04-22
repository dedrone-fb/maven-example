package com.dedrone;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@SuppressWarnings({ "SameParameterValue", "UseOfSystemOutOrSystemErr" })
public final class Main {

	private static final String MAPKEY = "key";

	private enum MyEnum {
		FOO, BAR, BAZ
	}

	private Main() {
	}

	public static void main(final String[] args) {
		final MyEnum e = MyEnum.FOO;
		printEnumHumanReadable(e);
		printEnumHumanReadableV2(e);
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

		if (Objects.equals(value.toString(), MyEnum.FOO.toString())) {
			System.out.println("check 2 - It is FOO");
		} else {
			System.out.println("check 2 - It is not FOO");
		}

		if (Objects.equals(value.toString(), "FOO")) {
			System.out.println("check 3 - It is FOO");
		} else {
			System.out.println("check 3 - It is not FOO");
		}

		if (Objects.equals(value.toString(), "FOO")) {
			System.out.println("check 4 - It is FOO");
		} else {
			System.out.println("check 4 - It is not FOO");
		}

	}

	/**
	 * Calculates the sum of two integers.
	 *
	 * @param firstInt The first integer.
	 * @param secondInt The second integer.
	 * @return The sum of a and b.
	 */
	static int intSumV1(final int firstInt, final int secondInt) {
		return firstInt + secondInt;
	}

	/**
	 * Calculates the sum of two integers.
	 *
	 * @param firstInt The first integer.
	 * @param secondInt The second integer.
	 * @return The sum of a and b.
	 */
	@SuppressWarnings({ "AssignmentToMethodParameter", "ValueOfIncrementOrDecrementUsed", "ReassignedVariable", "UnusedAssignment" })
	static int intSumV2(int firstInt, int secondInt) {
		return firstInt++ + secondInt++;
	}

	/**
	 * Calculates the sum of two integers, first incrementing both by 1.
	 *
	 * @param firstInt The first integer.
	 * @param secondInt The second integer.
	 * @return The sum of a and b.
	 */
	@SuppressWarnings({ "ValueOfIncrementOrDecrementUsed", "AssignmentToMethodParameter", "ReassignedVariable" })
	static int intSumV3(int firstInt, int secondInt) {
		return ++firstInt + ++secondInt;
	}

	/**
	 * Creates a map with specified number of entries.
	 *
	 * @param count The number of entries to create in the map.
	 * @return The map with the specified number of entries.
	 */
	@SuppressWarnings({ "ReassignedVariable", "StringConcatenationMissingWhitespace" })
	static Map<String, String> createMap(final int count) {
		final Map<String, String> result = new HashMap<>();
		for (int i = 0; i < count; i++) {
			result.put(MAPKEY + i, MAPKEY + i);
		}
		return result;
	}

}
