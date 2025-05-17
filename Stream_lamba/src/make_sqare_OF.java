import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class make_sqare_OF {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(5);
        System.out.println("Enter the elements in list : ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            list.add(sc.nextInt());
        }

//        List<Integer> sq = list.stream().map(n -> n * n).map(n -> n / 2).distinct().sorted((a,b) -> (b - a)).limit(4).skip(1).collect(Collectors.toList());
//        .distinct() : repetition remvoe
//        System.out.println(sq);

        List<Integer> st = Stream.iterate(0 , n -> n + 1).limit(101).skip(1).collect(Collectors.toList());

        System.out.println(st);

    }
}
