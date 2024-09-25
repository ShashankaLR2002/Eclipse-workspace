package com.xworkz.events.exception;
public class Person {
    
	private int age;

     public Person(int age) throws InvalidAgeException {
        if (age < 0) 
        {
           
            throw new InvalidAgeException("Age cannot be negative.");
        }
        else {
        	System.out.println("Continuing the process");
        }
        this.age = age;
    }

}
