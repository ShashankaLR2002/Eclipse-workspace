package com.xworkz.interfacedrivenprgs;

public class AddressRunner {

    public static void main(String[] args) {

        AddressRepository addressRepository = new AddressRepository() {
            @Override
            public boolean save() 
            {
                System.out.println("Saving address");
                return true;
            }

            @Override
            public int update() 
            {
                System.out.println("Updating address");
                return 1;
            }

            @Override
            public void delete() 
            {
                System.out.println("Deleting address");
            }

            @Override
            public String read() {
                System.out.println("Reading address");
                return "Address data";
            }
        };

        AddressService addressService = new AddressServiceImpl(addressRepository);
        addressService.push();
        addressService.refresh();
        addressService.remove();
        System.out.println(addressService.load());
    }
}

    


	