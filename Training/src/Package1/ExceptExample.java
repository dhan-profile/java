package Package1;

import java.io.*;
public class ExceptExample {
    public static void main(String arr[]){
      /*  int a= 5, b=0;
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
System.out.println("hello");*/
        try{
            FileReader f1= new FileReader("D:/Exception123.txt");
            
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