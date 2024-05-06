package Package2;

public class Threads1 extends Thread{

	public static void main(String[] arg) {
		Threads1 t1 = new Threads1();
		Threads1 t2 = new Threads1();
		Threads1 t3 = new Threads1();
		t1.setName("first");
		t1.start();
		
		try {
			t1.join();
			t2.interrupt();
			t2.yield();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(t1.isInterrupted()); 
		t2.start();
		t3.start();
		t3.setPriority(8);
		t1.getName();
		System.out.println(t2.getPriority());
		
	}
	
	public void run(){
		int i = 0;
		System.out.println("Started");
		while(i<5) {
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println(e);
			}
		System.out.print(i + " ");
		i++;
		}
		System.out.println();
		
	}
}
