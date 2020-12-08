package com.onus;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Data
@AllArgsConstructor
class Products {
	private int id;
	private String name;
	private float price;
}

public class FilterProducts {
	public static void main(String[] args) {
		List<Products> list = Arrays.asList(
			new Products(10, "HP Notebook", 399.99f),
			new Products(10, "Galaxy S9", 499.99f),
			new Products(10, "Tablet", 349.99f),
			new Products(10, "Macbook", 799.99f),
			new Products(10, "iPhone", 400.00f),
			new Products(10, "Dell Inspiron", 387.99f)
		);

//		Products less than $300
//		list.stream()
//			.filter(x -> x.getPrice() < 300)
//			.forEach(System.out::println);

//		Most expensive product
		list.stream()
			.min(Comparator.comparing(Products::getPrice))
			.ifPresent(System.out::println);
	}
}
