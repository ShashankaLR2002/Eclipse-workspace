package com.xworkz.encapsulation;


public class PersonRunner {
    public static void main(String[] args) {
      
        Person person = new Person();
        
        person.setName("John Doe");
        person.setAge(25);
        person.displayInfo();
        person.setAge(-5);  
    }
}

