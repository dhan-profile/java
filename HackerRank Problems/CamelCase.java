import java.io.*;
import java.util.*;
public class CamelCase {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner sc = new Scanner(System.in);
   while(sc.hasNext()){
   String input = sc.nextLine();
   String target = input.substring(4);
    if(input.charAt(0)== 'S'){
        if(input.charAt(2)== 'M'){
            for(int i=0;i<target.length();i++){
                if(Character.isUpperCase(target.charAt(i))){
                    int pos = target.indexOf(target.charAt(i));
                    target = target.substring(0,pos)+" "+Character.toLowerCase(target.charAt(i))+target.substring(pos+1);
                    i += 2;
                }
            }
            target = target.substring(0,target.length()-2);
            }
            if(input.charAt(2)== 'V'){
                for(int i = 0;i<target.length();i++){
                if(Character.isUpperCase(target.charAt(i))){
                    int pos = target.indexOf(target.charAt(i));
                    target = target.substring(0,pos)+" "+Character.toLowerCase(target.charAt(i))+target.substring(pos+1);
                    i += 2;
                }
                }
            }
                            if(input.charAt(2)== 'C'){
                target = Character.toLowerCase(target.charAt(0))+target.substring(1);
                for(int i = 1;i<target.length();i++){
                if(Character.isUpperCase(target.charAt(i))){
                    int pos = target.indexOf(target.charAt(i));
                    target = target.substring(0,pos)+" "+Character.toLowerCase(target.charAt(i))+target.substring(pos+1);
                    i += 2;
                }
                }
            }
        }
        if(input.charAt(0)== 'C'){
                        if(input.charAt(2)== 'M'){
            for(int i=0;i<target.length();i++){
                if(target.charAt(i) == ' '){
                    int pos = target.indexOf(target.charAt(i));
                    target = target.substring(0,pos)+Character.toUpperCase(target.charAt(i+1))+target.substring(pos+2);
                }
            }
            target = target + "()";
            }
            if(input.charAt(2)== 'V'){
            for(int i=0;i<target.length();i++){
                if(target.charAt(i) == ' '){
                    int pos = target.indexOf(target.charAt(i));
                    target = target.substring(0,pos)+Character.toUpperCase(target.charAt(i+1))+target.substring(pos+2);
                }
            }
            }
                            if(input.charAt(2)== 'C'){
                                target = Character.toUpperCase(target.charAt(0)) + target.substring(1);      
            for(int i=0;i<target.length();i++){
                if(target.charAt(i) == ' '){
                    int pos = target.indexOf(target.charAt(i));
                    target = target.substring(0,pos)+Character.toUpperCase(target.charAt(i+1))+target.substring(pos+2);
                }
            }
            }
        }
        System.out.println(target);
   }
}}
