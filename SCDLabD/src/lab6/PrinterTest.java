
package lab6;

public class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new Printer(10); // Start with 10 pages

        Thread printThread = new Thread(() -> {
            try {
                printer.print(new PrintJob("Document1", 15));
                printer.print(new PrintJob("Document2", 5));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread paperLoaderThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Wait for print job to start waiting
                printer.addPages(10); // Add more pages
                Thread.sleep(2000);
                printer.addPages(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        printThread.start();
        paperLoaderThread.start();
    }
}