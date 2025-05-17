import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class Bufferreader_and_writer {
    public static void main(String[] args) throws IOException {
//        Same code use for folder deletion
        File file = new File("file.txt");
        if(file.delete()){
            System.out.println("File deleted succesfully");
        }else{
            System.out.println("faileds");
        }
    }
}
