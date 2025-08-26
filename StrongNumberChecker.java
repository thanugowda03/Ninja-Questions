import java.util.Scanner;

public class StrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;

       
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

   
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong Number.");
        } else {
            System.out.println(originalNumber + " is not a Strong Number.");
        }

        scanner.close();
    }


    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
