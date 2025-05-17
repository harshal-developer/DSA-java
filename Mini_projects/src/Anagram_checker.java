import java.util.Scanner;
import java.util.Arrays;
public class Anagram_checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first String: ");
        String first = sc.nextLine().toLowerCase(); // Convert to lowercase to ignore case sensitivity

        System.out.println("Enter second String: ");
        String second = sc.nextLine().toLowerCase();

        sc.close(); // Close Scanner to prevent memory leak

        if (isAnagram(first, second)) {
            System.out.println("Strings are anagram");
        } else {
            System.out.println("Strings are not anagram");
        }
    }

    // Function to check if two strings are anagrams
    static boolean isAnagram(String first, String second) {
        if (first.length() != second.length()) {
            return false; // Length mismatch, not an anagram
        }

        int[] freq = new int[26]; // Frequency array for lowercase letters (a-z)

        // Count occurrences in both strings
        for (int i = 0; i < first.length(); i++) {
            freq[first.charAt(i) - 'a']++;  // Increase for first string
            freq[second.charAt(i) - 'a']--; // Decrease for second string
        }

        // If all values in the frequency array are 0, it's an anagram
        System.out.println(Arrays.toString(freq));
        for (int count : freq) {
            if (count != 0) {
                return false; // Character count mismatch
            }
        }

        return true;
    }
}
