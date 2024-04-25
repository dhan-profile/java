package Package1;
import java.util.Scanner;

public class NumberOfAlphabets {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] count = new int[26]; // Array to store count of each alphabet (a-z)
        System.out.println("Enter a string: ");
        String s1 = s.nextLine();
        for(int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                int index = Character.toLowerCase(c) - 'a'; // Map character to array index
                count[index]++;
            }
        }
        System.out.println("Alphabetic characters along with their occurrences:");
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                char ch = (char) ('a' + i);
                System.out.println(ch + ": " + count[i]);
            }
        }
    }
}
