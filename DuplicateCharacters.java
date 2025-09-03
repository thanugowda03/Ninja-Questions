import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        input = input.toLowerCase();

        
        Map<Character, Integer> charCountMap = new HashMap<>();

       
        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        
        System.out.println("Duplicate characters:");
        boolean found = false;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicate characters found.");
        }

        scanner.close();
    }
}
