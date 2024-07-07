package Strings;

public class StringExample {
static void add() {
	System.out.println("Add");
}
	public static void main(String[] args) {
		StringExample obj = new StringExample();
		obj.add();
		char ch1 = 'a';
		char ch2 = 'a';
		System.out.println(ch1 == ch2);
		System.out.println('b' == 'b');
		System.out.println(true == true);
		System.out.println(24 == 24);
		System.out.println("h" == "h");
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
