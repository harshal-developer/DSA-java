package Common_problems;

import java.util.ArrayList;
import java.util.List;

public class LC_2942_find_words_containing_character {
    public static List<Integer> findWordsContaining(String[] strings, char x){
        ArrayList<Integer> indices = new ArrayList<>();

        for(int i = 0; i < strings.length; i++){
            String word = strings[i];
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == x) {
                    indices.add(i);
                    break; // break after finding the character once
                }
            }
        }
        return indices;
    }
    public static void main(String[] args) {
        String[] que = {"leet","code"};
        List<Integer> solution = findWordsContaining(que, 'e');
        System.out.println(solution);
    }
}
