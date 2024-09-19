package com.xworkz.interfacedrivenprgs;

public class VehicleServiceImpl implements VehicleService 
{

    private VehicleRepository repository;

    public VehicleServiceImpl(VehicleRepository repository)
    {
        this.repository = repository;
    }

    @Override
    public boolean persist() 
    {
        if (repository != null) 
        {
            repository.save();
            System.out.println("Saved in vehicle repository");
            return true;
        } else {
            System.out.println("Vehicle repository is null");
            return false;
        }
    }

    @Override
    public boolean merge() 
    {
        if (repository != null) 
        {
            repository.update();
            System.out.println("Updated in vehicle repository");
            return true;
        } else {
            System.out.println("Vehicle repository is null");
            return false;
        }
    }

    @Override
    public boolean clear() {
        if (repository != null) 
        {
            boolean deleted = repository.delete();
            if (deleted) {
                System.out.println("Deleted from vehicle repository");
                return true;
            } else {
                System.out.println("Not deleted from vehicle repository");
                return false;
            }
        } else {
            System.out.println("Vehicle repository is null");
            return false;
        }
    }

    @Override
    public String search() 
    {
        if (repository != null)
        {
            System.out.println("Searching in vehicle repository");
            return repository.read();
        } else {
            System.out.println("Vehicle repository is null");
            return "failure";
        }
    }
    
}
