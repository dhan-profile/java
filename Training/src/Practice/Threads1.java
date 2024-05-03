package Practice;

public class Threads1 extends Thread{
	public void run() {
		System.out.println("Started");
		for(int i=0; i<8; i++) {
			System.out.print(i + " ");
			if(i % 2 == 0) {
				System.out.println(" Even Nos: " + i);
			}}
		System.out.println();
	}
	public static void main(String[] args) {
		Threads1 obj1 = new Threads1();
		Threads1 obj2 = new Threads1();
		Threads1 obj3 = new Threads1();
		Threads1 obj4 = new Threads1();
		Threads1 obj5 = new Threads1();
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj5.start();
	}

}
