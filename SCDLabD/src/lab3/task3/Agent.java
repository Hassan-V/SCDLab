package lab3.task3;

public class Agent implements CommonFunctions {
    private int id;
    private char name;

    public Agent(int id, char name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void searchTicket() {
        System.out.println("Searched For Ticket");
    }

    @Override
    public void bookTicket() {
        System.out.println("Ticket Booked");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Ticket Canceled");
    }

    @Override
    public void makePayment() {
        System.out.println("Payment Made");
    }

    @Override
    public void fillDetails() {
        System.out.println("Details Filled");
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }
}
