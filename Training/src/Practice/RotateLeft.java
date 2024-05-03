package Practice;

import java.util.Scanner;

public class RotateLeft {

    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 7, 1, 5};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rotations: ");
        int rotation = s.nextInt();
        int length = arr.length;
        int[] rotatedArr = new int[length];

        for(int i = 0; i < length; i++) {
            int newPosition = (i + rotation) % length;
            rotatedArr[i] = arr[newPosition];
        }

        System.out.println("Rotated array:");
        for(int i = 0; i < length; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
    }
}
