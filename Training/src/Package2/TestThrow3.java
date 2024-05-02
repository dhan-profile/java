package Package2;

class AgeNotValidateException extends Exception {
	public AgeNotValidateException(String str) {
		// Calling constructor of parent Exception
		super(str);
	}
}
// Class that uses above MyException  

public class TestThrow3 {
	static void validate(int age) {
		if (age >= 18) {
			System.out.println("Person is eligible to vote");
		} else {
			try {
				throw new AgeNotValidateException("This is user-defined exception");
			} catch (AgeNotValidateException e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String args[]) {
		validate(15);
	}
}
