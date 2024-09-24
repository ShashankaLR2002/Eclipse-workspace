package com.xworkz.partialabstraction;

public class Car extends Vehicle
{

	@Override
	void fuel() {
	System.out.println("Fueling the vehicle");	
	}
	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		car.fuel();
	}

}
