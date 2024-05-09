class MyThread extends Thread {
    public MyThread(String name) {
        this.setName(name);
        start();
        System.out.println("in constructor " + getName());
    }

    @Override
    public void start() {
        System.out.println("in start " + getName());
    }

    public void run() {
        System.out.println("in run " + getName());
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        new MyThread("oops");
    }
}
