package com.xworkz.fullabstraction;

public class Car implements Vehicle
{

	@Override
	public void start() {
    System.out.println("Starting the vehicle");
		
	}

	@Override
	public void fuel() {
	 System.out.println("Fueling the vehicle");
		
	}

	public static void main(String[] args) 
	{
		Car car = new Car();
		car.start();
		car.fuel();
	}
}
