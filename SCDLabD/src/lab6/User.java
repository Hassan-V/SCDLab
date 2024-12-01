package lab6;

public class User extends Thread {
    public String name;
    public String password;
    private Account account;

    public User(String name, String password, Account account) {
        this.name = name;
        this.password = password;
        this.account = account;
    }

    public String getUserName() {
        return name;
    }

    public void setUserName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void withdraw(double amount) {
        if (account == null) {
            System.out.println("Account is null");
            return;
        }

        synchronized (account) {
            System.out.println("Initial Balance: " +this.account.getBalance());
            if (amount > account.getBalance()) {
                System.out.println("You do not have enough money");
                return;
            }

            if (account.getMutex() == 0) {
                account.setMutex(1);
                account.setBalance(account.getBalance() - amount);
                System.out.println("Withdrawing Amount: " + amount);
                System.out.println("Balance: " + account.getBalance()+"\n");
                account.setMutex(0);
            } else {
                System.out.println("Another User Interacting with the account");
                try {
                    Thread.sleep(500);
                    withdraw(amount);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}