package com.xworkz.external;

public interface Vehicle 
{
    
    void start();

   
    default void fuel() 
    {
        System.out.println("Fueling the vehicle");
    }
}



