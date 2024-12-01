
package lab6;

public class PrintJob {
    private int pages;
    private String jobName;

    public PrintJob(String jobName, int pages) {
        this.jobName = jobName;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public String getJobName() {
        return jobName;
    }
}