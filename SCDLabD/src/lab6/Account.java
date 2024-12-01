package lab6;

public class Account {

    private int id;
    private double balance;
    private boolean isShared;
    private int mutex = 0;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isShared() {
        return isShared;
    }

    public void setShared(boolean shared) {
        isShared = shared;
    }

    public int getMutex() {
        return mutex;
    }

    public void setMutex(int mutex) {
        this.mutex = mutex;
    }
}
