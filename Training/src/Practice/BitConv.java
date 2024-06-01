package Practice;

public class BitConv {

	public static void main(String[] args) {
		int n = 100;
        String bin = Integer.toBinaryString(n);

        while(bin.length() < 8){
            bin = "0"+bin;
        }

        bin = bin.substring(4)+bin.substring(0,4);
        System.out.println(Integer.parseInt(bin,2));
	}
}
