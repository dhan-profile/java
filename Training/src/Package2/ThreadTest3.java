package Package2;

class MyThread4 extends Thread {
    public void run() {
        System.out.println("Running");
    }
	    public static void main(String args[]) throws InterruptedException {
        Runnable r = new MyThread4(); // #1
        Thread myThread = new Thread(r); // #2
        myThread.start();
    }
}

public class ThreadTest3 {
    public static void main(String args[]) throws InterruptedException {
        Runnable r = new MyThread4(); // #1
        Thread myThread = new Thread(r); // #2
        myThread.start();
    }
}