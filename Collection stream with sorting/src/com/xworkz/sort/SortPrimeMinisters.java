package com.xworkz.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortPrimeMinisters {
	public static void main(String[] args) {

		List<String> pmNames = new ArrayList<>();
		pmNames.add("Sardar Vallabhbhai Patel");
		pmNames.add("Lal Bahadur Shastri");
		pmNames.add("Rajendra Prasad");
		pmNames.add("Gulzarilal Nanda");
		pmNames.add("P. V. Narasimha Rao");
		pmNames.add("Manmohan Singh");
		pmNames.add("A. B. Vajpayee");
		pmNames.add("Narendra Modi");
		pmNames.add("Indira Gandhi");
		pmNames.add("H. D. Deve Gowda");

		List<String> sortedAscPM = pmNames.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Prime Minister names in ascending order:");
		sortedAscPM.forEach(pmName -> System.out.println(pmName));

		List<String> sortedDescPM = pmNames.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted Prime Minister names in descending order:");
		sortedDescPM.forEach(pmName -> System.out.println(pmName));
	}
}
