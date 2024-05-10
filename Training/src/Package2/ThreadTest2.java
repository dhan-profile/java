package Package2;

class MyThread3 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
	    public static void main(String arg[]) {
        Thread thread = new Thread(new MyThread3());
        thread.run();
        thread.run();
        thread.start();
    }
}

public class ThreadTest2 {
    public static void main(String arg[]) {
        Thread thread = new Thread(new MyThread3());
        thread.run();
        thread.run();
        thread.start();
    }
}