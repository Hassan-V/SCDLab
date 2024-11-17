package lab5;

class ThreadOne extends Thread {
    public void run(){
        System.out.println("Running Thread 1");
    }
}

class ThreadTwo extends Thread{
    public void run(){
        System.out.println("Running Thread 2");
    }
}

public class ThreadExecution2 {
    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        threadOne.start();
        threadTwo.start();
    }
}