package Common_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LC_49_Group_Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>(); 

        for(int i = 0; i < strs.length; i++){
            // original word 
            String word = strs[i];
         
            char[] sorting = word.toCharArray();
            Arrays.sort(sorting);
            // Sorted 
            String sorted = new String(sorting);

            // if any diff word then create a new list 
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(word);
        }

        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ls = groupAnagrams(arr);
        System.out.println(ls);
    }
}
