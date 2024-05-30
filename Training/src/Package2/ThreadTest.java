package Package2;

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
//    start() method is overrided, so run() method won't be called 

    public void run() {
        System.out.println("in run " + getName());
    }
	
	    public static void main(String[] args) {
        new MyThread("oops");
    }
}

public class ThreadTest {
//    public static void main(String[] args) {
//        new MyThread("oops");
//    }
}
