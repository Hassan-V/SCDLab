package lab5;

public class ThreadExecutionSample1 extends Thread {
    public void run() {
        System.out.println("This is a thread.");
    }

    public static void main(String[] args) {
        ThreadExecutionSample1 threadExecutionSample = new ThreadExecutionSample1();
        threadExecutionSample.start();

        ThreadExecutionSample1 threadExecutionSample2 = new ThreadExecutionSample1();
        threadExecutionSample2.start();
    }
}
