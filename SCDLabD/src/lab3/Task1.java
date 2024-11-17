package lab3;

public class Task1 {

    public static void main(String[] args) {
        StudentStatistics s1 = new StudentStatistics("Taqi Khan",550,529);

        System.out.println(s1.getStudentName());
        System.out.println(s1.calculateGPA());
        System.out.println(s1.calculatePercentage());
    }

}
