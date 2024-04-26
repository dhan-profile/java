import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
       s = s.trim();
        String[] wrd = s.split("[^A-Za-z]+");
        if(s.isEmpty()){
        System.out.println(0);
             }else{
        System.out.println(wrd.length);
        for (String tkn : wrd) {
          System.out.println(tkn); 
        }
    }
    scan.close();
    }
}

