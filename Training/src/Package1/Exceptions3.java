package Package1;

public class Exceptions3 {
	public static void main(String[] args) {
		try {
			try {
				int[] n = { 1, 2, 3, 4, 5 };
				System.out.println(n[8]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			String val = null;
			System.out.println("Value: " + val.length());
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Final");
		}
	}
}
