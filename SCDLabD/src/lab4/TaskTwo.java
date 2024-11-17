package lab4;

public class TaskTwo extends Thread {
    int tableNumber;

    public TaskTwo(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void run(){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 11; i++) {
            sb.append(tableNumber).append(" x ").append(i).append(" = ").append(i * tableNumber).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        TaskTwo t1 = new TaskTwo(298);
        TaskTwo t2 = new TaskTwo(22);
        t1.start();
        t2.start();
    }
}