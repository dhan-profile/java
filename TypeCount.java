import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'typeCounter' function below.
     *
     * The function accepts STRING sentence as parameter.
     */

    public static void typeCounter(String sentence) {
        String[] st = sentence.split("\\s+");
        int intCount = 0;
        int stringCount = 0;
        int doubleCount = 0;
        for(String t: st){
            try{
                Integer.parseInt(t);
                intCount += 1;
            } catch(NumberFormatException e) {
                try{
                    Double.parseDouble(t);
                    doubleCount += 1;
                } catch(NumberFormatException e2) {
                    stringCount += 1;
                }
            }
        }
        System.out.println("string " + stringCount);
        System.out.println("integer " + intCount);
        System.out.println("double " + doubleCount);
        
    }

}

public class TypeCount {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        Result.typeCounter(sentence);

        bufferedReader.close();
    }
}
