package Hashing.Common_problems;

import java.util.HashMap;

public class Anagram_checker {
    public static void main(String[] args) {
        String str1 = "Harshal";
        String str2 = "Marshal";

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < str2.length(); i++){
            char ch = str2.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) < 0) {
                    System.out.println("Not Anagram");
                    return;
                }
            } else {
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
