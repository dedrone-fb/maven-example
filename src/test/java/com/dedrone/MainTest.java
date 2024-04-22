package com.dedrone;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Main should")
class MainTest {

	@Test
	@DisplayName("correctly calculate sum of two integers (v1)")
	void intSumV1() {
		assertThat(Main.intSumV1(3, 5))
				.as("result of intSumV1 call")
				.isEqualTo(8);
	}

	@Test
	@DisplayName("correctly calculate sum of two integers (v2)")
	void intSumV2() {
		assertThat(Main.intSumV2(3, 5))
				.as("result of intSumV2 call")
				.isEqualTo(8);
	}

	@Test
	@DisplayName("correctly calculate sum of two integers (v3)")
	void intSumV3() {
		assertThat(Main.intSumV3(3, 5))
				.as("result of intSumV3 call")
				.isEqualTo(8);
	}

	@Test
	@DisplayName("creates a map with correct number of entries")
	void createMap() {
		final int count = 5;
		assertThat(Main.createMap(count))
				.as("result of createMap call")
				.hasSize(count);
	}

	@Test
	@DisplayName("creates a map with correct keys and values")
	void createMapKeysValues() {
		final int count = 5;
		final Map<String, String> map = Main.createMap(count);
		assertSoftly(softly -> {
			for (int i = 0; i <= count; i++) {
				softly.assertThat(map)
						.as("result of createMap call")
						.containsEntry("key" + i, "key" + i);
			}
		});
	}

}
