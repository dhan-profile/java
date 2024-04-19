public class SmallestMultiple {
    public static long findSmallestMultiple(int n) {
        long lcm = 1;

        // Iterate from 2 to n
        for (int i = 2; i <= n; i++) {
            lcm = lcm(lcm, i);
        }

        return lcm;
    }

    // Function to find the least common multiple (LCM) of two numbers
    public static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }

    // Function to find the greatest common divisor (GCD) of two numbers
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int n = 20; // Set the range from 1 to n
        System.out.println("The smallest positive number divisible by all numbers from 1 to " + n + " is: " + findSmallestMultiple(n));
    }
}
