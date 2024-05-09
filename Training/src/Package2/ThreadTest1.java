class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("In run method; thread name is: " + Thread.currentThread().getName());
    }
	    public static void main(String args[]) {
        Thread myThread = new MyThread();
        myThread.run(); // #1
        System.out.println("In main method; thread name is: " + Thread.currentThread().getName());
    }
}

public class ThreadTest1 {

    public static void main(String args[]) {
        Thread myThread = new MyThread();
        myThread.run(); // #1
        System.out.println("In main method; thread name is: " + Thread.currentThread().getName());
    }
}