import java.io.*;

public class handling {
    public static void main(String[] args) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\harsh\\Desktop\\Basics\\File_handling\\src\\file.txt"));
        writer.write("writing to a file\n");
        writer.write("writing to a file");
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\harsh\\Desktop\\Basics\\File_handling\\src\\file.txt"));
//        System.out.println(reader.readLine());// only prints first line
        String line; //we hold each line into a string
        while((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();
    }
}
