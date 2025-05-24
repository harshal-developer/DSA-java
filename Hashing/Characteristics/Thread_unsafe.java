package Characteristics;

import java.util.HashMap;

public class Thread_unsafe {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 20; i++)
                map.put("T1_" + i, "T1_val_" + i);
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 20; i++)
                map.put("T2_" + i, "T2_val_" + i);
        });

        t1.start();
        t2.start();

        System.out.println(map);
    }
}
