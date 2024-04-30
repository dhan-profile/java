package Package1;

public class Words1 {

	public static void main(String[] args) {
		String s = "Welcome to java";
		String s1 = s.substring(0, 7);
		String s2 = s.substring(8, 10);
		String s3 = s.substring(11);
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuffer sb2 = new StringBuffer(s2);
		StringBuffer sb3 = new StringBuffer(s3);
		sb1.reverse();
		sb2.reverse();
		sb3.reverse();
		System.out.print(sb1 + " ");
		System.out.print(sb2 + " ");
		System.out.print(sb3);
	}

}
