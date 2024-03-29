class Thread1 {
    public static void main(String[] args) {
        Name name = new Name();
        Welcome welcome = new Welcome();
        
        // Set priority for the Name thread lower than Welcome thread
        name.setPriority(Thread.MIN_PRIORITY);
        // Set priority for the Welcome thread higher than Name thread
        welcome.setPriority(Thread.MAX_PRIORITY);
        
        // Start the Welcome thread first
        welcome.start();
        
        // Ensure that the Welcome thread completes execution before starting the Name thread
        try {
            welcome.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Start the Name thread after the Welcome thread completes
        name.start();
    }
}

// Extend the Thread class
class Welcome extends Thread {
    public void run() {
        System.out.println("Welcome!");
    }
}

// Extend the Thread class
class Name extends Thread {
    public void run() {
        System.out.println("Please enter your name");
    }
}
