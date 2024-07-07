package Strings;

import java.lang.constant.Constable;

public class ObjectProgram extends Thread{
	transient int n1 = 10;
	volatile int n2 = 20;
	Constable intConstable = 30;
	public void run() {
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(intConstable);
		System.out.println("------------");
	}
	public static void main(String[] args) {
		ObjectProgram obj1 = new ObjectProgram();
		ObjectProgram obj2 = new ObjectProgram();
		System.out.println(obj1 instanceof ObjectProgram);
		obj1.start();
		obj1.setPriority(10);
		obj2.start();
	}
}
