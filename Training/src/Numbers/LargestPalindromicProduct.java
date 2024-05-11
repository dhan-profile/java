package Numbers;

import java.io.*;
import java.util.*;

public class LargestPalindromicProduct {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			System.out.println(lar_Pal_lessthan_n(n));
		}
		s.close();
	}

	public static int lar_Pal_lessthan_n(int n) {
		for (int i = n - 1; i >= 101101; i--) {
			if (ispal(i) && t2_t3fact(i)) {
				return i;
			}
		}
		return -1;
	}

	public static boolean ispal(int n) {
		int org = n;
		int r = 0;
		while (n != 0) {
			r = r * 10 + n % 10;
			n /= 10;
		}
		return org == r;
	}

	public static boolean t2_t3fact(int n) {
		for (int i = 999; i >= 100; i--) {
			if (n % i == 0 && n / i >= 100 && n / i <= 999) {
				return true;
			}
		}
		return false;
	}
}
