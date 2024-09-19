package com.xworkz.interfacedrivenprgs;

public class AddressServiceImpl implements AddressService 
{

    private AddressRepository repository;

    public AddressServiceImpl(AddressRepository repository)
    {
        this.repository = repository;
    }

    @Override
    public boolean push() 
    {
        if (repository != null) 
        {
            boolean saved = repository.save();
            if (saved) {
                System.out.println("Saved in address repository");
                return true;
            } else {
                System.out.println("Not saved in address repository");
                return false;
            }
        } else {
            System.out.println("Address repository is null");
            return false;
        }
    }

    @Override
    public boolean refresh() 
    {
        if (repository != null) 
        {
            int updated = repository.update();
            if (updated > 0) {
                System.out.println("Updated in address repository");
                return true;
            } else {
                System.out.println("Not updated in address repository");
                return false;
            }
        } else {
            System.out.println("Address repository is null");
            return false;
        }
    }

    @Override
    public boolean remove()
    {
        if (repository != null) 
        {
            repository.delete();
            System.out.println("Deleted from address repository");
            return true;
        } else {
            System.out.println("Address repository is null");
            return false;
        }
    }

    @Override
    public String load() 
    {
        if (repository != null) 
        {
            System.out.println("Loading from address repository");
            return repository.read();
        } else {
            System.out.println("Address repository is null");
            return "failure";
        }
    }
}
