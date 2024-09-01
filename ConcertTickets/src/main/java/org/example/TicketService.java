package org.example;

public class TicketService {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket(1, "red", 001, 1676419200, true, 'A', 25.9857);
        Ticket ticket3 = new Ticket("red", 001, 1676419200);
        Ticket.price = 3000;
        System.out.println(ticket1);
        System.out.println(ticket2);
        System.out.println(ticket3);
    }

}
