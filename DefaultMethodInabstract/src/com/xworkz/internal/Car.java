package com.xworkz.internal;

import com.xworkz.external.Vehicle;

 class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }


    public static void main(String[] args) {
       Vehicle car = new Car();
        car.start();  
        car.fuel();  
    }
}
 