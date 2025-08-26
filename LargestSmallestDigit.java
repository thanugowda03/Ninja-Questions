import java.util.Scanner;

public class LargestSmallestDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Convert to positive in case of negative input
        number = Math.abs(number);

        int largest = 0;
        int smallest = 9;

        // Extract digits and compare
        while (number > 0) {
            int digit = number % 10;

            if (digit > largest) {
                largest = digit;
            }

            if (digit < smallest) {
                smallest = digit;
            }

            number /= 10;
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Smallest digit: " + smallest);

        scanner.close();
    }
}
