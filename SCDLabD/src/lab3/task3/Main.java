package lab3.task3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Agent agent = new Agent(1, 'A');
        System.out.println("Agent Created: ID = " + agent.getId() + ", Name = " + agent.getName());

        Customer customer = new Customer('C', "John Doe", "123 Main St", 1234567890, 25);
        System.out.println("Customer Created: ID = " + customer.getCustomerId() + ", Name = " + customer.getName());

        Date dateOfJourney = new Date();
        Ticket ticket = new Ticket('X', 'Y', dateOfJourney, "10:00 AM", 'B', "12A");
        System.out.println("Ticket Created: Source = " + ticket.getSource() + ", Destination = " + ticket.getDestination());
        System.out.println("Date of Journey: " + ticket.getDateOfJourney() + ", Time: " + ticket.getTime());
        System.out.println("Bus No: " + ticket.getBusNo() + ", Seat No: " + ticket.getSeatNo());

        Refund refund = new Refund(100.50f, customer.getCustomerId());
        System.out.println("Refund Created: Amount = " + refund.getAmount() + ", Customer ID = " + refund.getCustomerId());

        BookingCounter bookingCounter = new BookingCounter();
        bookingCounter.requestBooking(agent, customer, ticket);

        refund.refundAmount();
        System.out.println("Refund processed for Customer ID: " + refund.getCustomerId());
    }
}
