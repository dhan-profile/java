import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> evennums = new ArrayList<Integer>();
        while (evennums.size() < 3) {
            int num = scanner.nextInt();
            evennums.add(num); // Add the input number to the ArrayList
        }
        // Calculate the sum of all values in the ArrayList
        int sum = 0;
        for (int i = 0; i < evennums.size(); i++) {
            sum += evennums.get(i);
        }
        // Calculate the average integer value
        int average = sum / evennums.size();
        System.out.println(average); // Output the average
    }
}