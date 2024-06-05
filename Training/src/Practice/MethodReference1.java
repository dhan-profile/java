package Practice;

@FunctionalInterface
interface Reference{
	void refer(String name, int no);
	default void add(int a, int b) {
		System.out.println("Interface Sum: "+ (a+b));
	}
}
@FunctionalInterface
interface People extends Reference{
	default void sum(int a, int b) {
		System.out.println("Interface Extends Sum: "+ (a+b));
	}
}

class User{
	void details(String userName, int rollNo) {
		System.out.println("User name: "+userName);
		System.out.println("Roll no: "+rollNo);
	}
}

public class MethodReference1 {
	public static void main(String[] args) {
		Reference r = (nam, num) -> {
			System.out.println(nam);
			System.out.println(num);
		};
		r.refer("Dhanush", 101);
		Reference r2 = new User() :: details;
		r2.refer("dhan", 1);
		People p = new People() {
			@Override
			public void refer(String name, int no) { }
		};
		p.sum(10, 12);
		r.add(20, 30);
	}

}
