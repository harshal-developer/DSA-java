package Common_problems;

import java.util.HashMap;

public class LC_13_Roman_to_integer {
    public static void main(String[] args) {
        String roman = "MCMXCIV";
        int num = romanToInt(roman);
        System.out.println(num);
    }

    public static int romanToInt(String roman){
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int result = 0;
        for(int i = 0; i < roman.length(); i++){
            int current = romanMap.get(roman.charAt(i));

            if(i + 1 < roman.length()){
                int next = romanMap.get(roman.charAt(i + 1));
                // if the current character less than next roman char then substract it else add 
                if(current < next){
                    result -= current;
                }else{
                    result += current;
                }
            }else{
                // for last roman character 
                result += current;
            }
        }
        return result;
    }
}
