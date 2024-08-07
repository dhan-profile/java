package Package2;

public class InterthreadCommunication {

    private int n = 1;

    public static void main(String[] args) {
        InterthreadCommunication obj = new InterthreadCommunication();
        Thread t1 = new Thread(() -> obj.odd());
        Thread t2 = new Thread(() -> obj.even());

        t1.start();
        t2.start();
    }

    public synchronized void odd() {
        while (n < 100) {
            if (n % 2 == 0) { try { wait(); } catch (InterruptedException e) { } }
            System.out.println(n);
            n++;
            notify();
        }
    }

    public synchronized void even() {
        while (n <= 100) {
            if (n % 2 != 0) { try { wait(); } catch (InterruptedException e) { } }
            System.out.println(n);
            n++;
            notify();
        }
    }
}

