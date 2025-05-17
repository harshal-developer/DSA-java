import java.util.ArrayList;
import java.util.Scanner;

public class bubble_Main_on_Strings {
    public static void main(String[] args) {
//        Logic
//        String a = "he";
//        String b = "her";
//        if value > 0 : b is bigger else a is bigger if == 0 then both are equal
//        System.out.println(a.compareTo(b));

//        Using Arralist :
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings you want to add");
        int size = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the " + size + " elements :");
        for(int i = 0; i < size; i++){
            String element = sc.nextLine();
            arr.add(element);
        }
        System.out.println("Sorting in progress");
        bubble_sort_list(arr);

    }
    private static void bubble_sort_list(ArrayList<String> list){
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size() - i - 1; j++){
                if(list.get(j).compareTo(list.get(j + 1)) > 0){
                    String temp = list.get(j);
                    list.set(j , list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
