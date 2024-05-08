package Practice;

import java.io.IOException;
import java.util.Optional;

public class Threads2 implements Runnable{
	static{
		int a=5;
		System.out.println(a);
	}
	public static void main(String[] args) throws IOException {
		Threads2 Obj1 = new Threads2();
		Threads2 Obj2 = new Threads2();
		Thread th1 = new Thread(Obj1);
		Thread th2 = new Thread(Obj2);
		th1.setName("first");
		th2.setName("second");
		th2.setPriority(10);
		th1.start(); 
		th2.start();
//		System.out.println(th1.isDaemon());
//		System.out.println(th1.isAlive());
		System.out.println(th1.getName());
//		th1.setDaemon(true);
		try {
			divide(4);
		} catch (IOException e) {
			System.out.println(e);
		}
		multiply(5);
	}

	private static int divide(int i) throws IOException {
		Threads2 Obj3 = new Threads2();
		Thread th3 = new Thread(Obj3);
		th3.start();
		int div = i/2;
		System.out.println(th3.getState());
		return div;
	}

	private synchronized static void multiply(int i) throws IOException{
		int j=1;
		while(i <= 10) {
			System.out.print(i * j + " ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			i++; j++;
		}
		System.out.println();
	}

	public void run() {
		int i = 5;
		try {
			multiply(i);
		} catch (IOException e) {
			System.out.println(e);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Running");
		System.out.println(Thread.currentThread());
	}	
}
