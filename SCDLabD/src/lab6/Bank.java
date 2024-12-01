package lab6;

public class Bank {
    public static void main(String[] args) {
        Account sharedAccount = new Account(23,50000.0);

        User user1 = new User("Taqi", "0123456789", sharedAccount);
        User user2 = new User("Ibad", "9876543210", sharedAccount);

        Thread thread1 = new Thread(() -> user1.withdraw(45000.0));
        Thread thread2 = new Thread(() -> user2.withdraw(20000.0));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + sharedAccount.getBalance());
    }
}