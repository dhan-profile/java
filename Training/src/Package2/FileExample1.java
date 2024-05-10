package Package2;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExample1 {

	public static void main(String[] args) {
		File f = new File("C:/Public/Test1.txt");
		File f1 = new File("C:/Public");
		String[] arr1 = f1.list();
		try {
			f.createNewFile();
//			System.out.println("Successful");
//			f1.createNewFile();
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.length());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.mkdir());
			System.out.println(Arrays.toString(arr1));
		}
		catch (IOException e) {
			System.out.println(e);
		}
		finally{
			System.out.println("Ended");
		}
	}

}
