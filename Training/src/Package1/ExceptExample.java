package Package1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
public class ExceptExample {
    public static void main(String arr[]){
        int a= 5, b=0;
        try{
            int c[]= new int[10];
            c[11]=a/b;
                 
           // System.out.println("java"+c);
        }
        catch(ArrayIndexOutOfBoundsException on){
           System.out.println(on);
           
        }
        catch(ArithmeticException on){
           System.out.println(on);
           
        }
        
        catch(Exception on){
           System.out.println(on);
           
        }
System.out.println("hello");
        try{
            FileReader f1= new FileReader("C:/Dhanush/Java/2024/Programs/Files/Filestasks1.txt");
//            Path fileName = Path.of("C:/Dhanush/Java/2024/Programs/Files/Filestasks1.txt");
            Path fileName = Path.of("C:/Users/DELL/Documents/GitHub/java/Training/src/Package1/ExceptExample.java");
            String str = Files.readString(fileName);
            System.out.println(str);
            /*String s="hello";
            int i= Integer.parseInt(s);
            System.out.println(i);*/
            
//            String str="123";
//            int k= Integer.parseInt(str);
//            System.out.println(k);
        }
        catch(Exception on){
           System.out.println(on);
           
        }
//        finally{
//         System.out.println("welcome");
//          System.out.println("welcome");
//        }
       
    }
    
}