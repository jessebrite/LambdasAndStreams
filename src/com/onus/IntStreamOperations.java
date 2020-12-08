package com.onus;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
	public static void main(String[] args) {
		int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

		System.out.print("The original values: ");
		System.out.println(
			IntStream.of(values)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(" ")));

		System.out.printf("%nCount: %d%n",
			IntStream.of(values).count());

		System.out.printf("%nMinimum: %d%n",
			IntStream.of(values)
				.min()
				.getAsInt());

		System.out.printf("%nMaximum: %d%n",
			IntStream.of(values)
				.max()
				.getAsInt());

		System.out.printf("%nAverage: %.2f%n",
			IntStream.of(values)
				.average()
				.getAsDouble());

		System.out.printf("%nSum via reduce method: %d%n",
			IntStream.of(values).reduce(0, (x, y) -> x + y));

		System.out.printf("%nProduct via reduce method: %d%n",
			IntStream.of(values)
				.reduce((x, y) -> x * y)
				.getAsInt());

		System.out.printf("%nSum of squares via map and sum: %d%n",
			IntStream.of(values).map(x -> x * x).sum());

		System.out.printf("%nValues displayed in sorted order: %s%n%n",
			IntStream.of(values)
				.sorted()
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(" ")));

		System.out.println(IntStream.of(values).summaryStatistics());
	}
}
