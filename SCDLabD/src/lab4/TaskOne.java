package lab4;

public class TaskOne extends Thread{
    public void run(){
        System.out.println("task one");
    }
    public static void main(String[] args){
        TaskOne t1=new TaskOne();
        TaskOne t2=new TaskOne();
        TaskOne t3=new TaskOne();
        t1.start();
        t2.start();
        t3.start();
    }
}