import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateAndTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dateOne = LocalDate.now();
		System.out.println("LocalDate: "+dateOne);
		LocalDate birthday = LocalDate.of(1070, Month.NOVEMBER, 5);
		System.out.println("Birthday: "+birthday);
		/*******************************************/
		LocalTime timeOne = LocalTime.now();
		System.out.println("\nLocalTime: "+timeOne);
		LocalTime ofTime = LocalTime.of(12, 30, 30);
		System.out.println("ofTime: "+ofTime);
		/***********************************************/
		LocalDateTime dateTimeOne = LocalDateTime.now();
		System.out.println("\nDate Time: "+dateTimeOne);
		LocalTime time2 = LocalTime.of(2, 34);
		LocalDateTime dateTimeTwo = LocalDateTime.of(birthday, time2);
		System.out.println("Date TimeTwo: "+ dateTimeTwo);
		
		LocalDateTime midnigtNYE = LocalDateTime.of(2017, Month.DECEMBER, 31, 23, 59);
		midnigtNYE = midnigtNYE.plusSeconds(61);
		System.out.println("Midnight NYE: "+midnigtNYE);
		midnigtNYE = midnigtNYE.plusSeconds(61).plusMinutes(23).plusHours(12).plusMonths(11);
		System.out.println("Midnight NYE add seconds, minutes, hours, months: "+midnigtNYE);
		
		LocalDate date2 = LocalDate.of(2018, Month.JANUARY,1);
		LocalTime ofTime2 = LocalTime.of(21, 30, 30);
		LocalDateTime dT2 = LocalDateTime.of(date2, ofTime2);
		
		System.out.println("Date time : "+dT2);
		
		dT2 = dT2.plusMonths(14).plusHours(-1);
		
		System.out.println("\n"+dT2);
		ofTime2 = ofTime2.plus(1, ChronoUnit.MINUTES);
		System.out.println(ofTime2);
		
		
		
		
		Period ofYears = Period.ofYears(3);
		Period ofMonths = Period.ofMonths(24);
		System.out.println(ofYears);
		System.out.println(ofMonths);
		
		LocalDate today = LocalDate.now();
		System.out.println("Today is : "+today);
		Period fourDays = Period.ofDays(4);
		Period weeks18 = Period.ofWeeks(18);
		
		today = today.plus(fourDays).plus(weeks18);
		
		System.out.println("\nToday plus period: "+today);
		
		
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println("\nLong date format: "+formatter.format(date));
		
		DateTimeFormatter formatterShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println("\nShort format: "+formatterShort.format(date));
		
		DateTimeFormatter formatterFull = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("\nFull format: "+formatterFull.format(date));
		
		DateTimeFormatter formatterMedium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println("\nMedium format: "+formatterMedium.format(date));
		
		LocalTime timeNow = LocalTime.now();
		DateTimeFormatter formatterTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println("\nShort format Time: "+formatterTime.format(timeNow));
		/*get a datetime exception at run time when you use long or full*/
		
		LocalDateTime dateTimeNow = LocalDateTime.now();
		DateTimeFormatter formatterDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT);
		System.out.println("\nShort format dateTime: "+formatterDateTime.format(dateTimeNow));
		
		
		LocalDateTime dateTimeOf = LocalDateTime.of(1970, Month.NOVEMBER, 5, 14, 00);
		DateTimeFormatter formatDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT);
		System.out.println("\nShort format dateTime: "+formatDateTime.format(dateTimeOf));
		
		
		
		LocalDateTime dateTPattern = LocalDateTime.of(1970, Month.NOVEMBER, 5, 14, 00);
		DateTimeFormatter formatDTPattern = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
		System.out.println("\nShort format dateTime: "+dateTPattern.format(formatDTPattern));
		
		
		LocalDateTime dateTime1 = LocalDateTime.of(2017, Month.AUGUST, 8, 14, 00);
		formatDTPattern = DateTimeFormatter.ofPattern("EEEE MMMM d. h:mm a");
		System.out.println("\nShort format dateTime: "+dateTime1.format(formatDTPattern));
		
		
	
		
		
		
		
	}

}
