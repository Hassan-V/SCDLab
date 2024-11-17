package lab3.task3;

public class Refund {
    private float amount;
    private char customerId;

    public Refund(float amount, char customerId) {
        this.amount = amount;
        this.customerId = customerId;
    }

    public void refundAmount() {
        System.out.println("Refund amount is " + amount);
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public char getCustomerId() {
        return customerId;
    }

    public void setCustomerId(char customerId) {
        this.customerId = customerId;
    }
}
