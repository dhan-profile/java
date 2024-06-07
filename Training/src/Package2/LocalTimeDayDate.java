package Package2;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeDayDate {

	// ------------------------ LocalTime - It is a Final class ----------
	// get the current local time
	LocalTime local = LocalTime.now();
//    System.out.println(local);

//    System.out.println(local.getHour());
//    System.out.println(local.getMinute());
//    System.out.println(local.getSecond());
//    System.out.println(local.getNano());

	/*
	 * //convert String into LocalTime LocalTime local1 =
	 * LocalTime.parse("08:30:20"); System.out.println("String into Time: "+local1);
	 * 
	 * // Converting LocalTime to String LocalTime d = LocalTime.now(); String dstr
	 * = d.format(DateTimeFormatter.ISO_TIME);
	 * System.out.println("Time into string :  " + dstr);
	 */

//     boolean loc = LocalTime.parse("11:30").isBefore(LocalTime.parse("10:30"));
//     System.out.println("isBefore: "+loc);
//     
//     boolean loc1 = LocalTime.parse("11:30").isAfter(LocalTime.parse("10:30"));
//     System.out.println("isAfter: "+loc1);
//    
//     //To provide your own time without date
//    LocalTime local2 = LocalTime.of(8,50);
//    System.out.println("set own time: "+local2);
//    
//    LocalTime local5 = LocalTime.MAX;
//    System.out.println("Max: "+local5);
//    
//    LocalTime time = local.plusMinutes(120);
//    LocalTime time1 = local.plusHours(05);
//    System.out.println(time);
//    System.out.println("current time + pluseHours: "+time1);
//    
//    
//    LocalTime time2 = local.minusMinutes(120);
//    System.out.println(time2);
//    
//    System.out.println(local.withHour(5));
//    System.out.println(local.withSecond(5));
//    System.out.println(local.withMinute(5));

//--------------------LocalDate class - immutable class -- default format of yyyy-mm-dd. ----------------------------------
	LocalDate date = LocalDate.now();

//LocalDate yesterday = date.minusDays(1);    
//LocalDate tomorrow = yesterday.plusDays(2);    
//System.out.println("Today date: "+date);    
//System.out.println("Yesterday date: "+yesterday);    
//System.out.println("Tomorrow date: "+tomorrow);  
//
//LocalDate date1 = LocalDate.of(2017, 1, 13);    
//System.out.println(date1.isLeapYear());    
//LocalDate date2 = LocalDate.of(2016, 9, 23);    
//System.out.println(date2.isLeapYear());    
	/*
	 * // Converting LocalDate to String LocalDate d1 = LocalDate.now(); String
	 * d1Str = d1.format(DateTimeFormatter.ISO_DATE);
	 * System.out.println("Date1 in string :  " + d1Str);
	 * 
	 * // String to LocalDate //String dInStr = "2011-09-01"; LocalDate daa =
	 * LocalDate.parse("2011-09-01"); System.out.println("String to LocalDate : " +
	 * daa);
	 */

//    System.out.println(date.getDayOfMonth());
//    System.out.println(date.getDayOfWeek());
//    System.out.println(date.getDayOfYear());
//    System.out.println(date.atTime(20,10));
//    
//    System.out.println(date.getMonth());//Month name
//    System.out.println(date.getMonthValue());//digit form
//    System.out.println(date.getYear());
//    
//    System.out.println(date.lengthOfMonth());
//    System.out.println(date.ofYearDay(2024, 63));
//    
//    System.out.println(yesterday.compareTo(tomorrow));
//    System.out.println(yesterday.equals(tomorrow));

//LocalDate bday = LocalDate.of(1995, 11, 13);
//LocalDate cday = LocalDate.now();
//System.out.println(cday.compareTo(bday));
//
//int a=bday.getYear();
//int b= cday.getYear();
//System.out.println(b-a);

//-----------------------LocalDateTime----------------------------
//
//LocalDate date1 = LocalDate.now();  
//LocalTime time = LocalTime.now();
//LocalDateTime localdatetime = LocalDateTime.of(date1, time);
//System.out.println(localdatetime);

//System.out.println(LocalDateTime.now());
//  System.out.println(LocalDateTime.of(2015, 2, 20, 06, 30));
//System.out.println(LocalDateTime.parse("2015-02-20T06:30:00"));
//
//LocalDateTime date = LocalDateTime.parse("2015-02-20T06:30:00");
//
//System.out.println(date.plusDays(1));
//System.out.println(date.getMonth());

	/*
	 * LocalTime time = LocalTime.parse("09:32:42"); LocalDate date =
	 * LocalDate.parse("2018-12-05");
	 * 
	 * // apply atDate() LocalDateTime local= time.atDate(date); //LocalDateTime
	 * local1= date.atTime(time);
	 * 
	 * // print LocalDateTime System.out.println("Date and Time:"+
	 * local.toString()); System.out.println("Date and Time:"+ local);
	 * 
	 */
}
