package com.xworkz.interfacedrivenprgs;

public class VehicleRunner
{
public static void main(String[] args) 
{
VehicleRepository vehicleRepository = new VehicleRepository() 
{
    @Override
    public void save() 
    {
        System.out.println("Saving vehicle");
    }

    @Override
    public void update() 
    {
        System.out.println("Updating vehicle");
    }

    @Override
    public boolean delete() 
    {
        System.out.println("Deleting vehicle");
        return true;
    }

    @Override
    public String read() 
    {
        System.out.println("Reading vehicle");
        return "Vehicle data";
    }
};

VehicleService vehicleService = new VehicleServiceImpl(vehicleRepository);
vehicleService.persist();
vehicleService.merge();
vehicleService.clear();
System.out.println(vehicleService.search());
}
}

