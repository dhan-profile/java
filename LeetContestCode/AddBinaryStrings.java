import java.util.*;
class AddBinaryStrings {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';

            result.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0)
            result.append(carry);

        return result.reverse().toString();
    }
	public static void main(String[] args){
		String s1 = "001";
		String s2 = "111";
		String res = addBinary(s1, s2);
		System.out.println(res);
	}
}
