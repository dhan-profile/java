package Practice;

interface Reference{
	void refer(String name, int no);
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
	}

}
