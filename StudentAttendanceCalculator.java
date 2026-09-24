import java.util.Scanner;

public class StudentAttendanceCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter attended classes: ");
        int attendedClasses = sc.nextInt();

        double attendance = (attendedClasses * 100.0) / totalClasses;

        System.out.println("\n=== Attendance Details ===");
        System.out.println("Total Classes: " + totalClasses);
        System.out.println("Attended Classes: " + attendedClasses);
        System.out.println("Attendance Percentage: " + attendance + "%");

        if (attendance >= 75) {
            System.out.println("Status: Eligible");
        } else {
            System.out.println("Status: Not Eligible");
        }

        sc.close();
    }
}
