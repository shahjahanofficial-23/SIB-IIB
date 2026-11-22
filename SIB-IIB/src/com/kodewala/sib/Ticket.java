package com.kodewala.sib;

public class Ticket {
    private static int nextId = 1;
    private int ticketId;
    private String status;

    // Runs for every new Ticket, before the constructor
    {
        ticketId = nextId++;
        status = "Open";
        System.out.println("Instance block: preparing ticket " + ticketId);
    }

    public Ticket(String status) {
        this.status = status;
    }

    public void display() {
        System.out.println("Ticket #" + ticketId + " — " + status);
    }

    public static void main(String[] args) {
        Ticket first = new Ticket("In Progress");
        Ticket second = new Ticket("Resolved");

        first.display();
        second.display();
    }
}