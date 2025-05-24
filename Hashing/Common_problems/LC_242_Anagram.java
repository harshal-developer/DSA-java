package Common_problems;

import java.util.Arrays;
import java.util.HashMap;

public class LC_242_Anagram {
    static boolean isAnagram(String s, String t) {
        // Option 1 : shortCut 
        // Common for all 
        if(t.equals(s)){
            return true;
        }
        if (s.length() != t.length()) {
            return false;
        }

        // char[] sA = s.toCharArray();
        // char[] tA = t.toCharArray();

        // Arrays.sort(sA);
        // Arrays.sort(tA);
        
        // return Arrays.equals(sA, tA);

        // Option 2 : Using HashMap 
        // HashMap<Character, Integer> map = new HashMap<>();
        // for(char ch : s.toCharArray()){
        //     map.put(ch, map.getOrDefault(ch, 0) + 1); //count frequencies 
        // }

        // for(char ch : t.toCharArray()){
        //     if(!map.containsKey(ch)) return false;
        //     map.put(ch, map.get(ch) - 1);
        //     if(map.get(ch) < 0) return false;
        // }
        // return true;

        // Option 3 : Using traditional method : Arrays
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            // initially 0 
            freq[s.charAt(i) - 'a']++; //that 0 increment by one 
            freq[t.charAt(i) - 'a']--; //decrement by 1
        }

        for (int f : freq)
            if (f != 0) return false;

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
