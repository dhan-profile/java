import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class PalindromeSubString {

    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      String in = s.next();
      for(int i = in.length();i > 0;i--){
        int t1 = in.length() - i + 1;
        int f = 0;
        for(int j = 0;j < t1;j++){
          if(check(in.substring(j,j+i))){
            System.out.println(i);
            f = 1;
            break;
          }
        }
        if(f == 1)
          break;
      }
    }
    static boolean check(String a){
      int t = a.length();
      //System.out.println(a);
      for(int i = 0;i < t;i++){
        if(a.charAt(i) != a.charAt(t-i-1))
          return false;
      }
      return true;
    }
}