public class NthPrimeNumber{
    public static void main(String[] args) {
        int n = 10001;
        int primeCount = 0;
        int num = 2;

        while (primeCount < n) {
            if (isPrime(num)) {
                primeCount++;
            }
            num++;
        }

        System.out.println("The 10001st prime number is: " + (num - 1));
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}