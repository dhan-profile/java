package Practice;

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



public class Array2D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> rows = new ArrayList<>();
        IntStream.range(0, 6).forEach(i -> {
            try {
                rows.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        ArrayList<Integer> count=new ArrayList<Integer>();
        //column size 6 and row size 6 
        for(int column=0;column<4;column++){
            for (int row =0;row<4;row++){
                int tempcount=rows.get(row).get(column)+rows.get(row).get(column+1)+rows.get(row).get(column+2);
                tempcount+=rows.get(row+1).get(column+1);
                tempcount+=rows.get(row+2).get(column)+rows.get(row+2).get(column+1)+rows.get(row+2).get(column+2);
                if(count.size()>0){
                count.add(tempcount>count.get(count.size()-1)?tempcount:count.get(count.size()-1));
                }else{
                    count.add(tempcount);
                }
            }
        }
       if(count.size()!=0){
        System.out.println(count.get(count.size()-1));}
        bufferedReader.close();
    }
   
}
