import java.util.Scanner;

public class GCDLCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        
        int a = num1;
        int b = num2;

        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        int lcm = (num1 * num2) / gcd;

        // Output the results
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);

        scanner.close();
    }
}
