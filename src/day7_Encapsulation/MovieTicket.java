package day7_Encapsulation;

public class MovieTicket {

    private String movieName;
    private String seatNumber;
    private double ticketPrice;
    private boolean isBooked;

    // Setters
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    // Getter
    public String getMovieName() {
        return movieName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public boolean isBooked() {
        return isBooked;
    }

    // Method to display ticket details
    public void displayTicketInfo() {
        System.out.println("Movie name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + ticketPrice);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }

    // Optional Booking Logic
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket Successfully booked");
        } else {
            System.out.println("This is already booked");
        }
    }
}
