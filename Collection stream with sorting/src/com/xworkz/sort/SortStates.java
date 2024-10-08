package com.xworkz.sort;

import java.util.*;
import java.util.stream.Collectors;

public class SortStates {
	public static void main(String[] args) {

		List<String> stateNames = new ArrayList<>();
		stateNames.add("Kerala");
		stateNames.add("Punjab");
		stateNames.add("Haryana");
		stateNames.add("Uttarakhand");
		stateNames.add("Telangana");
		stateNames.add("Odisha");
		stateNames.add("Assam");
		stateNames.add("Himachal Pradesh");
		stateNames.add("Jammu and Kashmir");
		stateNames.add("Sikkim");

		List<String> sortedAscStates = stateNames.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted State names in ascending order:");
		sortedAscStates.forEach(stateName -> System.out.println(stateName));

		List<String> sortedDescStates = stateNames.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Sorted State names in descending order:");
		sortedDescStates.forEach(stateName -> System.out.println(stateName));
	}
}
