package Package2;

import java.io.*;

class TestExceptionPropagation2 {
	void m() throws IOException {
		// int c= 10/0;
		throw new IOException("device error");// checked exception
		// FileReader f = new FileReader("D:abc.txt");
	}

	void n() throws IOException {
		m();
	}

	void p() throws IOException {
		// try{
		n();
		// }catch(IOException e){System.out.println("exception handled");}
	}

	public static void main(String args[]) throws IOException {
		try {
			TestExceptionPropagation2 obj = new TestExceptionPropagation2();
			obj.p();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
		System.out.println("normal flow");
	}
}
