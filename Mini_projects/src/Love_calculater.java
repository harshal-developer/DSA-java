import java.util.Scanner;

public class Love_calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter your name: ");
        String person1 = sc.nextLine().toLowerCase();
        System.out.print("Enter his/her name: ");
        String person2 = sc.nextLine().toLowerCase();
        sc.close();

        // Process names
        String combined = person1 + person2;
        String occurrences = getCharacterOccurrences(combined);
        int lovePercentage = calculateLovePercentage(occurrences);

        // Output result
        System.out.println("Love Percentage: " + lovePercentage + "%");
    }

    static String getCharacterOccurrences(String str) {
        int[] freq = new int[26];
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') freq[ch - 'a']++;
        }
        StringBuilder result = new StringBuilder();
        for (int count : freq) if (count > 0) result.append(count);
        return result.toString();
    }

    static int calculateLovePercentage(String numStr) {
        while (numStr.length() > 2) {
            StringBuilder newNum = new StringBuilder();
            for (int i = 0; i < numStr.length() - 1; i++)
                newNum.append((Character.getNumericValue(numStr.charAt(i)) + Character.getNumericValue(numStr.charAt(i + 1))) % 10);
            numStr = newNum.toString();
        }
        return Integer.parseInt(numStr);
    }
}
