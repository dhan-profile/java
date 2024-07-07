package ObjectOrientedPrograms;

public abstract class AbstractClass {
final int num1 = 1;
static int num2 = 2;
private int num3 = 3;
protected int num4 = 4;
public int num5 = 5;

AbstractClass(){
	
}

final void add() {
	System.out.println(1);
}

void add1(int n1) {
	System.out.println(n1);
}

protected void add2(int n2) {
	System.out.println(n2);
}


public static void main(String[] args) {
	AbstractClass obj = new AbstractClass() {
		@Override
		void add1(int n1) {
			System.out.println(2.1);
		}
	};
	obj.add();
	obj.add1(2);
	obj.add2(3);
}

}
