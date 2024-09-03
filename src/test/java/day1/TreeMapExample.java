package day1;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {

    public static void main(String[] args) {
        String input = "Hello123!@#";

        // Create TreeMaps to store letters, digits, and special characters separately
        TreeMap<Character, Integer> letters = new TreeMap<>();
        TreeMap<Character, Integer> digits = new TreeMap<>();
        TreeMap<Character, Integer> specialChars = new TreeMap<>();

        // Iterate through each character in the input string
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.put(ch, letters.getOrDefault(ch, 0) + 1);
            } else if (Character.isDigit(ch)) {
                digits.put(ch, digits.getOrDefault(ch, 0) + 1);
            } else {
                specialChars.put(ch, specialChars.getOrDefault(ch, 0) + 1);
            }
        }

        // Print the letters
        System.out.println("Letters:");
        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Print the digits
        System.out.println("\nDigits:");
        for (Map.Entry<Character, Integer> entry : digits.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Print the special characters
        System.out.println("\nSpecial Characters:");
        for (Map.Entry<Character, Integer> entry : specialChars.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
