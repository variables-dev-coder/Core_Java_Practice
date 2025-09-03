package day48_Collection_Map_Interface;

import java.util.*;

// Ticket class
class Ticket {
    String pnr;
    String passengerName;
    String flightNo;
    String status; // Booked, Cancelled, Checked-in

    public Ticket(String pnr, String passengerName, String flightNo) {
        this.pnr = pnr;
        this.passengerName = passengerName;
        this.flightNo = flightNo;
        this.status = "Booked"; // default status
    }

    @Override
    public String toString() {
        return pnr + " → " + passengerName + " | Flight: " + flightNo + " | Status: " + status;
    }
}

public class FlightBookingSystem {
    public static void main(String[] args) {
        Map<String, Ticket> bookings = new HashMap<>();

        // Book tickets
        bookings.put("PNR1001", new Ticket("PNR1001", "Alice", "AI-202"));
        bookings.put("PNR1002", new Ticket("PNR1002", "Bob", "BA-303"));
        bookings.put("PNR1003", new Ticket("PNR1003", "Charlie", "EK-404"));

        // Display all tickets
        System.out.println("All Bookings:");
        for (Ticket t : bookings.values()) {
            System.out.println(t);
        }

        // Cancel a ticket
        Ticket t1 = bookings.get("PNR1002");
        t1.status = "Cancelled";
        System.out.println("\nCancelled Ticket: " + t1);

        // Check ticket status
        String checkPNR = "PNR1003";
        System.out.println("\nStatus of " + checkPNR + ": " + bookings.get(checkPNR));

        // Remove a booking
        bookings.remove("PNR1001");
        System.out.println("\nAfter removing PNR1001:");
        for (Ticket t : bookings.values()) {
            System.out.println(t);
        }
    }
}

/*
Logic:
Create a Ticket class with pnr, passengerName, flightNo, status.
Use HashMap<String, Ticket> → Key = PNR number, Value = Ticket object.
Operations:
Book new ticket
Cancel ticket
Check ticket status
Display all tickets


All Bookings:
PNR1001 → Alice | Flight: AI-202 | Status: Booked
PNR1002 → Bob | Flight: BA-303 | Status: Booked
PNR1003 → Charlie | Flight: EK-404 | Status: Booked

Cancelled Ticket: PNR1002 → Bob | Flight: BA-303 | Status: Cancelled

Status of PNR1003: PNR1003 → Charlie | Flight: EK-404 | Status: Booked

After removing PNR1001:
PNR1002 → Bob | Flight: BA-303 | Status: Cancelled
PNR1003 → Charlie | Flight: EK-404 | Status: Booked

 */