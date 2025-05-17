import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] old = {1, 2};
        int[] newArr = new int[4];
        System.arraycopy(old, 0, newArr, 0, old.length);
        System.out.println(Arrays.toString(newArr));

    }
}