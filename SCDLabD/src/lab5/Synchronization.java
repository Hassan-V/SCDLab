package lab5;

class Synchr {
    int total_seats=10;

    void  busTicket(int seats) {
        if(total_seats>=seats)
        {
            System.out.println(seats+ "  Seats booked successfully");
            total_seats=total_seats-seats;
            System.out.println("seats left   " +total_seats);

        }
        else {
            System.out.println("Sorry Seats cannot be booked....!!");
            System.out.println("seats left "+total_seats);
        }

    }
}

public class Synchronization extends Thread {
    static  Synchr  b;
    int seats;

    public void run(){
        b. busTicket(seats);
    }

    public static void main(String args[])
    {
        b =new Synchr();

        Synchronization t1 =new Synchronization();
        t1.seats=7;
        t1.start();

        Synchronization t2 =new Synchronization();
        t2.seats=7;
        t2.start();
    }
}