import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversedNum = 0;

        // Reverse logic
        while (num != 0) {
            int digit = num % 10;          
            reversedNum = reversedNum * 10 + digit; 
            num = num / 10;                
        }

        System.out.println("Reversed number: " + reversedNum);

        sc.close();
    }
}