import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        input = input.toLowerCase();

       
        Map<Character, Integer> charCountMap = new HashMap<>();

        
        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' = " + entry.getValue());
        }

        scanner.close();
    }
}
