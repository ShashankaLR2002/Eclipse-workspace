package com.xworkz.fuctionalintf;

public class Runner 
{
public static void main(String[] args) 
{
	Swiggy swiggy = new Swiggy();
	
	FoodApp foodapp =(String item)->
	{System.out.println("Swiggy item  : "+item);};
	swiggy.item(foodapp);
}
}
