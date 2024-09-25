package com.xworkz.events.exception;

public class Runner {
 public static void main(String[] args) {
     try {
         Person person = new Person(-5); 
     } catch (InvalidAgeException ref) {
       
         System.out.println("Error: " + ref.getMessage()); 
     }
 }
}

