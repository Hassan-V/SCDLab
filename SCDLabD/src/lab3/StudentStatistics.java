package lab3;

public class StudentStatistics {
    private final String studentName;
    private final int totalMaks;
    private final int obtainedMarks;

    public StudentStatistics(String studentName, int totalMaks, int obtainedMarks) {
        this.studentName = studentName;
        this.totalMaks = totalMaks;
        this.obtainedMarks = obtainedMarks;
    }

    public String calculatePercentage() {
        double percentage = ((double) this.obtainedMarks / this.totalMaks) * 100;
        return percentage + "%";
    }

    public String calculateGPA() {
        double GPA = ((double) this.obtainedMarks / this.totalMaks) * 4;
        return GPA + "%";
    }

    public String getStudentName() {
        return studentName;
    }
}