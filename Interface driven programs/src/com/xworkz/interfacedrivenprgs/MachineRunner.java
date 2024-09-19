package com.xworkz.interfacedrivenprgs;

public class MachineRunner 
{
public static void main(String[] args)
{
	MachineRepository machineRepository = new MachineRepository() 
	{
        @Override
        public void save() 
        {
            System.out.println("Saving machine");
        }

        @Override
        public int update() 
        {
            System.out.println("Updating machine");
            return 1;
        }

        @Override
        public int delete() 
        {
            System.out.println("Deleting machine");
            return 1;
        }

        @Override
        public int read() 
        {
            System.out.println("Reading machine");
            return 53444;
        }
    };

    MachineService machineService = new MachineServiceImpl(machineRepository);
    machineService.save();
    machineService.update();
    machineService.delete();
    System.out.println(machineService.read());
}
}
