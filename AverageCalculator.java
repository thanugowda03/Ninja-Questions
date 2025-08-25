import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter how many numbers: ");
        int n = scanner.nextInt();

        double sum = 0;

       
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double number = scanner.nextDouble();
            sum += number;
        }

       
        double average = sum / n;

        System.out.println("Average = " + average);

        scanner.close();
    }
}
