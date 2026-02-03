import java.util.Scanner;

public class ResultCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks in Maths (m): ");
        int m = sc.nextInt();

        System.out.print("Enter marks in Biology (b): ");
        int b = sc.nextInt();

        System.out.print("Enter marks in English (e): ");
        int e = sc.nextInt();

        System.out.print("Enter marks in History (h): ");
        int h = sc.nextInt();

        System.out.print("Enter marks in Science (s): ");
        int s = sc.nextInt();

        // Calculate average
        float avg = (float)(m + b + e + h + s) / 5;

        // Print average till one decimal point
        System.out.printf("Average = %.1f\n", avg);

        // Result logic
        if (m < 30 || b < 30 || e < 30 || h < 30 || s < 30) {
            System.out.println("Fail");
        }
        else if (m >= 90 && b >= 90 && avg >= 70) {
            System.out.println("JEE, Medical");
        }
        else if (m >= 90 && b >= 70 && avg >= 70) {
            System.out.println("JEE");
        }
        else if (b >= 90 && avg >= 60) {
            System.out.println("Medical");
        }
        else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
