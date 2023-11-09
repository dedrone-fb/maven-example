package com.dedrone;

import java.util.HashMap;
import java.util.Map;

public class SomeClass {

	private enum MyEnum {
		FOO, BAR, BAZ;
	}

	public static void main(final String[] args) {
		final MyEnum e = MyEnum.FOO;
		doSomething1(e);
		doSomething2(e);

		final Map<String, Integer> myMap = new HashMap<>();
		doSomething3(myMap.get("key"));
	}

	private static void doSomething1(final MyEnum e) {

		System.out.println("== doSomething1 ==");

		if (e == MyEnum.FOO) {
			System.out.println("It is FOO");
		} else if (e == MyEnum.BAR) {
			System.out.println("It is BAR");
		}
	}

	private static void doSomething2(final MyEnum e) {

		System.out.println("== doSomething2 ==");

		if (e == MyEnum.FOO) {
			System.out.println("check 1 - It is FOO");
		} else {
			System.out.println("check 1 - It is not FOO");
		}

		if (e.toString() == MyEnum.FOO.toString()) {
			System.out.println("check 2 - It is FOO");
		} else {
			System.out.println("check 2 - It is not FOO");
		}

		if (e.toString() == "FOO") {
			System.out.println("check 3 - It is FOO");
		} else {
			System.out.println("check 3 - It is not FOO");
		}

		if (e.toString() == new String("FOO")) {
			System.out.println("check 4 - It is FOO");
		} else {
			System.out.println("check 4 - It is not FOO");
		}

	}

	private static void doSomething3(final int a) {

		System.out.println('== doSomething3 ==');

		System.out.println(a);
	}

	public static int doSomething4(int a, int b) {
		return a + b;
	}

	public static int doSomething5(int a, int b) {
		return a++ + b++;
	}

	public static int doSomething6(int a, int b) {
		return ++a + ++b;
	}

}
