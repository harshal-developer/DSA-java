package Mock_Dated_26_05_25;

class MyThread extends Thread {
    public void run() {
        System.out.println("running it");
    }
}

public class Threading {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
