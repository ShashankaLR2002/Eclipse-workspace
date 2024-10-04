package com.xworkz.enumprograms;

public class Runner {
    public static void main(String[] args) {
    
        CustomerDTO customer = new CustomerDTO("Shashank lr ", "lrshashank2002@gmail.com", ProductType.KITCHEN);
        customer.printDetails();
        
        System.out.println("------");

     
        TicketBookDTO ticket = new TicketBookDTO("Inception", "PVR Cinemas", TicketType.ONLINE, SeatType.RECLINER);
        ticket.printDetails();
    }
}
