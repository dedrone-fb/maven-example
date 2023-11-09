package com.dedrone;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SomeClassTest {

	@Test
	void doSomething4() {
		assertThat(SomeClass.doSomething4(3, 5))
				.as("result of soSomething4 call")
				.isEqualTo(8);
	}

	@Test
	void doSomething5() {
		assertThat(SomeClass.doSomething5(3, 5))
				.as("result of soSomething5 call")
				.isEqualTo(8);
	}

}
