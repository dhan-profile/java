public class CodingNinjas1 {

    public static void main(String[] args) {
        String str1 = "Coding";
        int len = str1.length();

        String str2 = "";
        while (len > len / 2) {
            len--;
            str2 += str1.charAt(len);
        }

		//str1 = str1.toUpperCase();
		//str2 = str2.toLowerCase();

        String str = str1 + str2;

        //if(str.contains("NGgn")) {
            str += "Ninjas";
        //}

        str = str.toLowerCase();
        System.out.println(str);
    }
}