package lab6;

public class SharedAccount {
    private Account account;
    private User user1;
    private User user2;

    public SharedAccount(Account account, User user1, User user2) {
        this.account = account;
        this.account.setShared(true);
        this.user1 = user1;
        this.user2 = user2;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public User getUser2() {
        return user2;
    }
    public void setUser2(User user2) {
        this.user2 = user2;
    }
}
