import java.util.Scanner;

public class count_vowels_consonants {
    static void count_vowels_and_consonants(String str){
        if(!str.isEmpty()){
            int counter = 0;
            int consonants_couter = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                    counter ++;
                }else{
                    consonants_couter ++;
                }
            }
            System.out.println("Total vowels : " + counter);
            System.out.println("Total consonants : " + consonants_couter);
        }else{
            System.out.println("Please, Enter a valid String");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = sc.nextLine();
        String str_lower = str.toLowerCase();
        sc.close();
        count_vowels_and_consonants(str_lower);
    }
}
