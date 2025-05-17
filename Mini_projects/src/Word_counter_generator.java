import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Word_counter_generator {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the sentences : ");
        String sentense = scanner.nextLine();

        workCounter(sentense);
    }
    static void workCounter(String sentence){
        sentence = sentence.toLowerCase();
//        Split text into words
        String[] words = sentence.split("\\W+");
//        create a list to store unique words
        List<String> uniqueWords = new ArrayList<>();
//        create a list to store counters
        List<Integer> counters = new ArrayList<>();

        for(String word : words){
            if(word.isEmpty()){
//                Skip empty string
                continue;
            }
            int index = uniqueWords.indexOf(word);
            if(index == -1){
//                System.out.println(index); //- 1
                // If the word is not already in the list, add it and initialize its count to 1
                uniqueWords.add(word);
                counters.add(1);
            }else{
                // If the word is already in the list, increment its frequency count
                counters.set(index, counters.get(index) + 1);
            }
        }

        for(int i = 0; i < uniqueWords.size(); i++){
            System.out.println(uniqueWords.get(i) + " : " + counters.get(i));
        }

    }
}
