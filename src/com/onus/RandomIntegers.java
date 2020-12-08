package com.onus;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class RandomIntegers {
	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();

		System.out.println("Random numbers on separate lines");
		random
			.ints(10, 1, 7)
			.forEach(System.out::println);

		String number =
			random.ints(10, 1, 7)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(" "));

		System.out.printf("%nRandom numbers on one line: %s%n", number);
	}
}
