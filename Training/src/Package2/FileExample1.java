package Package2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileExample1 {

	public static void main(String[] args) {
		File f = new File("C:/Public/Test1.xlsx");
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
		FileWriter fw;
		try {
			fw = new FileWriter("C:/Public/Test1.txt");
			fw.write("Hello, this is a test file to test java FileWriter. Writes text to character files using a default buffer size. \r\n "
					+ "Encoding from characters to bytes uses either a specified charsetor the default charset."
					+ "\n"
					+ "Whether or not a file is available or may be created depends upon theunderlying platform. \n"
					+ "Some platforms, in particular, allow a file to beopened for writing by only one FileWriter (or other file-writingobject) at a time.\r\n "
					+ "In such situations the constructors in this classwill fail if the file involved is already open. \n"
					+ "\n"
					+ "The FileWriter is meant for writing streams of characters.\r\n "
					+ "For writingstreams of raw bytes, consider using a FileOutputStream.\r\n"
					+ "Thank you");
			fw.close();
		} catch (IOException e) {
			System.out.println(e);
		}

//				FileReader fr = new FileReader("C:/Public/Test1.txt");
//				int i;
//				while((i = fr.read()) != -1) {
//					System.out.print((char) i);
//					fr.close();
//				}
		} 
}
