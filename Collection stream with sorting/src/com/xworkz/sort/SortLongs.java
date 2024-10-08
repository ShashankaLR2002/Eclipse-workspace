package com.xworkz.sort;

import java.util.*;
import java.util.stream.Collectors;

public class SortLongs {
	public static void main(String[] args) {

		List<Long> longList = new ArrayList<>();
		longList.add(42L);
		longList.add(15L);
		longList.add(67L);
		longList.add(89L);
		longList.add(32L);
		longList.add(100L);
		longList.add(7L);
		longList.add(56L);
		longList.add(21L);
		longList.add(3L);

		List<Long> sortedAsc = longList.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Longs in ascending order:");
		sortedAsc.forEach(sortedValue -> System.out.println(sortedValue));

		List<Long> sortedDesc = longList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted Longs in descending order:");
		sortedDesc.forEach(sortedValue -> System.out.println(sortedValue));
	}
}
