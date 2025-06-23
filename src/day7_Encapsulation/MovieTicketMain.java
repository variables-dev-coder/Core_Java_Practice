package day7_Encapsulation;

public class MovieTicketMain {
    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();

        mt.setMovieName("Interstellar");
        mt.setSeatNumber("A11");
        mt.setTicketPrice(585.0);
        mt.setBooked(false);

        mt.displayTicketInfo();

        // Booking the ticket
        mt.bookTicket();

        System.out.println("\n---After Booking-----");
        mt.displayTicketInfo();
    }
}
