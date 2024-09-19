package com.xworkz.interfacedrivenprgs;

public class MachineServiceImpl implements MachineService 
{

    private MachineRepository repository;

    public MachineServiceImpl(MachineRepository repository)
    {
        this.repository = repository;
    }

    @Override
    public boolean save() 
    {
        if (repository != null) 
        {
            repository.save();
            System.out.println("Saved in machine repository");
            return true;
        } else {
            System.out.println("Machine repository is null");
            return false;
        }
    }

    @Override
    public boolean update() 
    {
        if (repository != null) 
        {
            int updated = repository.update();
            if (updated > 0)
            {
                System.out.println("Updated in machine repository");
                return true;
            } else {
                System.out.println("Not updated in machine repository");
                return false;
            }
        } else {
            System.out.println("Machine repository is null");
            return false;
        }
    }

    @Override
    public boolean delete() 
    {
        if (repository != null) 
        {
            int deleted = repository.delete();
            if (deleted > 0) {
                System.out.println("Deleted from machine repository");
                return true;
            } else {
                System.out.println("Not deleted from machine repository");
                return false;
            }
        } else {
            System.out.println("Machine repository is null");
            return false;
        }
    }

    @Override
    public String read() 
    {
        if (repository != null) 
        {
            System.out.println("Reading from machine repository");
            return Integer.toString(repository.read());
        } else {
            System.out.println("Machine repository is null");
            return "failure";
        }
    }
}
