package com.xworkz.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String[] args)
	{
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Porshe");
		cars.add("BMW");
		cars.add("Lamborgini");
		cars.add("Jaguar");
		cars.add("Lamborgini");
		
		for(String ref : cars)
		{
			System.out.println(ref);
		}
		
		Iterator<String> iterator = cars.iterator();
		
		while(iterator.hasNext())
		{
			String car = iterator.next();
		
		
		if(car.equals("Lamborgini"))
		{
			iterator.remove();
		}
		}
		System.out.println("-----------------");

		for(String ref : cars)
		{
			System.out.println(ref);
		}
		
		
	}

}
