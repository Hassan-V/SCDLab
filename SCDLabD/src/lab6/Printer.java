
package lab6;

public class Printer {
    private int availablePages;
    private boolean printing = false;

    public Printer(int initialPages) {
        this.availablePages = initialPages;
    }

    public synchronized void addPages(int pages) {
        availablePages += pages;
        System.out.println("Added " + pages + " pages. Total available: " + availablePages);
        notifyAll();
    }

    public synchronized void print(PrintJob job) throws InterruptedException {
        while (printing || availablePages < job.getPages()) {
            System.out.println("Waiting for resources - Job: " + job.getJobName() 
                + " (needs " + job.getPages() + " pages, available: " + availablePages + ")");
            wait();
        }

        printing = true;
        System.out.println("\nStarting print job: " + job.getJobName());
        Thread.sleep(1000); // Simulate printing time
        availablePages -= job.getPages();
        System.out.println("Completed printing " + job.getPages() + " pages");
        System.out.println("Remaining pages: " + availablePages);
        printing = false;
        notifyAll();
    }
}