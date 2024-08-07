package Package2;

class Show {
	synchronized void say(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.print("hello..");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name);
		}
	}
}

public class Synch extends Thread {
	Show obj;
	String name;

	Synch(Show obj, String name) {
		this.obj = obj;
		this.name = name;
	}

	public void run() {
		// Show obj=new Show();
		obj.say(name);
	}

	public static void main(String[] args) {
		Show t = new Show();
		
		Synch obj = new Synch(t, "dude");
		Synch ob = new Synch(t, "everyone");
		Synch ob1 = new Synch(t, "all");
		obj.start();
		ob.start();
		ob1.start();
	}
}
