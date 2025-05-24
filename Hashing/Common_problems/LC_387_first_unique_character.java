package Common_problems;

import java.util.HashMap;

public class LC_387_first_unique_character {
    static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // insert in map 
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);// if ch present in map then increment hte val by 1 else keep 0
        }
        // System.out.println(map);
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode")); //output 2
    }
}
