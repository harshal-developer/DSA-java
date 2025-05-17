import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class create_a_stream {
    public static void main(String[] args){
        List<String> list = Arrays.asList("harshal", "dd", "ff");
//        convert collection  to stream
        Stream<String> stream = list.stream();

//        Convert array to stream
        String [] array = {"harshal", "dd", "ff"};
        Stream<String> array_str = Arrays.stream(array);

//        Create stream directly
        Stream<Integer> intstream = Stream.of(1,2,3,2,3,2,3);
//        Or
        Stream<Integer> strm = Stream.iterate(0, n->n+1).limit(100);
//        Or : Generate of stream of something
        Stream<String> genrate_new = Stream.generate(() -> "hello").limit(5);
//        System.out.println(genrate_new);
    }


}
