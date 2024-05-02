import java.io.*;
import java.util.*;
import java.math.*;

public class Primality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input integer
        String input = scanner.nextLine();
        
        // Create a BigInteger object with the input value
        BigInteger num = new BigInteger(input);
        
        // Check if the number is prime
        if (num.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        
        scanner.close();
    //     Scanner s = new Scanner(System.in);
    //     int n = s.nextInt();
    //     boolean prime = isPrime(n);
    //     if(prime){
    //     System.out.println("prime");
    //     } else {
    //         System.out.println("not prime");
    //     }
    // }
    // static boolean isPrime(int n){
    //     if(n <= 1){
    //         return false;
    //     }
    //     for(int i=2; i<=Math.sqrt(n); i++){
    //         if(n % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}
}