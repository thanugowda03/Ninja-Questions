import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

      
        String[] words = input.split(" ");

        
        StringBuilder result = new StringBuilder();

        
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            result.append(reversedWord).append(" ");
        }

     
        System.out.println("Reversed each word: " + result.toString().trim());

        scanner.close();
    }
}
