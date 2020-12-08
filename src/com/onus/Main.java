package com.onus;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		//Summing the numbers
		System.out.printf("Sum of 1 through 10: %d%n",
			IntStream.rangeClosed(1, 10)
				.map(x -> x * 2)
				.sum());

		// Filtering numbers, mapping and reducing
		System.out.printf(
			"%nSum of the triples of the even ints from 2 through 10: %d%n",
			IntStream.rangeClosed(1, 10)
				.filter(x -> x % 2 == 0)
				.map(x -> x * 3)
				.sum());
	}
}
