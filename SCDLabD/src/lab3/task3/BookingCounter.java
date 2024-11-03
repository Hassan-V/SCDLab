package lab3.task3;

public class BookingCounter {
    public void requestBooking(Agent agent, Customer customer, Ticket ticket) {
        System.out.println("Processing booking request...");

        // Agent fills in ticket details and books it for the customer
        agent.fillDetails();
        agent.bookTicket();

        // Print out booking details
        System.out.println("Booking Details:");
        System.out.println("Agent ID: " + agent.getId());
        System.out.println("Agent Name: " + agent.getName());
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Ticket Source: " + ticket.getSource());
        System.out.println("Ticket Destination: " + ticket.getDestination());
        System.out.println("Date of Journey: " + ticket.getDateOfJourney());
        System.out.println("Time: " + ticket.getTime());
        System.out.println("Bus No: " + ticket.getBusNo());
        System.out.println("Seat No: " + ticket.getSeatNo());

        System.out.println("Booking completed successfully.");
    }

    // Additional methods as necessary, e.g., to handle cancellations, refunds, etc.
}
