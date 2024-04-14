package Numbers;
import java.util.*;
public class LatestTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the time(HH:MM): ");
		String s = sc.nextLine();
		System.out.println(findLatestTime(s));
	}
	public static String findLatestTime(String s) {
		char[] time = s.toCharArray();
		if(time[0] == '?') {
			time[0] = (time[1] == '?') ? '1' : (time[1] == '1') ? '1' : (time[1] == '0') ? '1' : '0';
		}
		if(time[1] == '?') {
			time[1] = (time[0] == '?') ? '1' : (time[0] == '1') ? '1' : '9';
		}
		if(time[3] == '?') {
			time[3] = '5';
		}
		if(time[4] == '?') {
			time[4] = '9';
		}
		return new String(time);
	}
}
