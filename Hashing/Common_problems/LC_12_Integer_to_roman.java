package Common_problems;

public class LC_12_Integer_to_roman {
    public static void main(String[] args) {
        int num = 1994;
        System.out.println(intToRoman(num));
    }

    public static String intToRoman(int num){
         int[] values =    {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols ={"M",  "CM","D", "CD", "C", "XC","L","XL","X","IX","V","IV","I"};
        // why the values are in 1,4,5,9 range : because they are special substractive cases in roman numerical system 
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }
}
