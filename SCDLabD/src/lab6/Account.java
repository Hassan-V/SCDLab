package lab6;

public class Account {
    private int id;
    private volatile double balance;
    private boolean isShared;
    private boolean inUse = false;

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

    public synchronized boolean withdrawMoney(double amount, String userName) {
        while (inUse) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        
        inUse = true;
        System.out.println("\n" + userName + " has locked the account");
        System.out.println("Current Balance: " + balance);
        
        if (amount <= balance) {
            try {
                // Simulate transaction time
                Thread.sleep(1000);
                balance -= amount;
                System.out.println(userName + " successfully withdrew: " + amount);
                System.out.println("Remaining Balance: " + balance);
                return true;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                inUse = false;
                notifyAll();
            }
        } else {
            System.out.println(userName + ": Insufficient funds for withdrawal of " + amount);
            inUse = false;
            notifyAll();
            return false;
        }
        return false;
    }
}
