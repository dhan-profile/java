package Practice;

import java.util.Date;
import java.lang.reflect.Field;

public record Record(int x, int y) {
	
	public Record(int x, int y) {
		this.x = 4;
		this.y = 8;
	}
	public int x() {
	    return this.x;
	}
	public int y() {
	    return this.y;
	}

	public static void main(String[] args) {
		Record r = new Record(5,10);
		byte[] b = new byte[1024];
		b[100] = 127;
		
		System.out.println(r.x + " " + r.y);
		//r.x = 20; 
		System.out.println(r.x());
		System.out.println(r.y());
		System.out.println(b[100]);
		
		Character ch = 'N';
		Boolean bo = true;
		
		ch.toLowerCase(ch);
		System.out.println(ch);
		System.out.println(bo);
		Field f ;
		Date date = new Date();
		System.out.println(date);
		String str = new String("Hello");
		String str1 = "Hello";
		
	}
	
	public static void main(int[] args) {
		args[0] = 10;
		args[100] = 1000;
		Constant c = new Constant();
//		c.A = 5;
//		System.out.println(c.getA());
	}
}

class Constant<T>{
	
	private int n = 1;
	
	private static final char[] A = {'A'};

	static{
	int A = 10;
	System.out.println(A);
	}

	public static char[] getA() {
		return A;
	}
}


class Addition{
	Addition(){
		
	}
	private int add;
	public Addition(int add) {
		super();
		this.add = add;
	}
	Addition ad = new Addition(50);	
	Test t1 = new Test();
	
}

class Test{
	private int t = 2;
	public void add() {
		int s = t;
	}
}
