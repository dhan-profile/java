import java.util.Scanner;

class DayNameFinder{
	public static void main(String x[]){
		Scanner scan = new Scanner(System.in);
		DayNameFinder df = new DayNameFinder();
		System.out.println("Enter the date (day, month, year) in numbers:");
		int day = scan.nextInt();
		int month = scan.nextInt();
		int year = scan.nextInt();
		System.out.println("The day name is: " + df.findDay(day, month, year));
	}
	
	public String findDay(int dayValue, int monthValue, int yearValue){
		if(monthValue == 1 || monthValue == 2){
			monthValue += 12;
			yearValue--;
		}
		int yearOfCentury = yearValue % 100;
		int century = yearValue / 100;
		int result = (dayValue + (13 * (monthValue + 1)/5 + yearOfCentury + yearOfCentury/4 + century/4 + 5*century)) % 7;
		String[] dayName = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		return dayName[result];
	}
}
