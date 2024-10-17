package com.xworkz.runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import com.xworkz.constants.Location;
import com.xworkz.dto.MallDTO;

public class MallRunner {
	public static void main(String[] args) {
		
		List<MallDTO> malls = new ArrayList<>();
		malls.add(new MallDTO(1, "Lulu Mall", Location.KOCHI, "M. A. Yusuff Ali", 150000));
		malls.add(new MallDTO(2, "Phoenix Marketcity", Location.BANGALORE, "John Doe", 125000));
		malls.add(new MallDTO(3, "DLF Mall of India", Location.DELHI, "Jane Smith", 130000));
		malls.add(new MallDTO(4, "Inorbit Mall", Location.MUMBAI, "Alex Turner", 90000));
		malls.add(new MallDTO(5, "Ambience Mall", Location.GURGAON, "Sarah Johnson", 180000));
		malls.add(new MallDTO(6, "Select Citywalk", Location.DELHI, "Michael Scott", 85000));
		malls.add(new MallDTO(7, "Forum Mall", Location.BANGALORE, "Chris Martin", 110000));
		malls.add(new MallDTO(8, "VR Mall", Location.CHENNAI, "Martin King", 120000));
		malls.add(new MallDTO(9, "The Great India Place", Location.NOIDA, "Tom Hardy", 100000));
		malls.add(new MallDTO(10, "Mantri Square", Location.BANGALORE, "Bruce Wayne", 95000));


		malls.sort((m1, m2) -> Integer.compare(m2.getId(), m1.getId())); 
		System.out.println("Malls sorted by ID in descending order:");
		malls.forEach(mall -> System.out.println(mall));


		malls.sort((m1, m2) -> m2.getName().compareTo(m1.getName())); 
		System.out.println("\nMalls sorted by name in descending order:");
		malls.forEach(mall -> System.out.println(mall));

		
		System.out.println("\nIterator Example:");
		Iterator<MallDTO> iterator = malls.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("\nListIterator Example:");
		ListIterator<MallDTO> listIterator = malls.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("ListIterator backwards:");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	
		System.out.println("\nMalls with land dimension less than 100,000:");
		malls.stream()
			.filter(mall -> mall.getLandDimension() < 100000)
			.forEach(mall -> System.out.println(mall));

	
		List<String> mallNames = malls.stream()
			.map(mall -> mall.getName())
			.collect(Collectors.toList()); 
		System.out.println("\nNames of malls:");
		mallNames.forEach(name -> System.out.println(name));

		
		List<Double> sortedLandDimensions = malls.stream()
			.map(mall -> mall.getLandDimension())
			.sorted()
			.collect(Collectors.toList()); 
		System.out.println("\nLand dimensions sorted in ascending order:");
		sortedLandDimensions.forEach(dimension -> System.out.println(dimension));
	}
}
