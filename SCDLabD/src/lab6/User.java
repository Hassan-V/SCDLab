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
            System.out.println(name + ": Account is null");
            return;
        }

        System.out.println(name + " attempting to withdraw: " + amount);
        account.withdrawMoney(amount, name);
    }
}