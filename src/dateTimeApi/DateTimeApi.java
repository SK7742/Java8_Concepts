package dateTimeApi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class DateTimeApi {
	
	
	/*
	  
    “yyyy-MM-dd”: This pattern represents a date in the format 2023-07-20.
    “dd/MM/yyyy”: This pattern represents a date in the format 20/07/2023.
    “MM dd, yyyy”: This pattern represents a date in the format 07 20, 2023.
    “E, MMM dd yyyy”: This pattern represents a date in the format Thu, Jul 20 2023.
    “h:mm a”: This pattern represents time in 12-hour format like 12:08 PM.
    “HH:mm”: This pattern represents time in 24-hour format like 00:08.
     
	 */
	public static void main(String[] args) {
//		1. Write a Java program to create a Date
		solutionForQuestionOne();
//		Write a Java program to get and display information (year, month, day, hour, minute)
		solutionForQuestionTwo();
//		Write a Java program to get the current time in New York. 
		solutionForQuestionThree();
//		Write a Java program to get the last day of the current month
		solutionForQuestionFour();
//		Write a Java program to calculate the first and last day of each week
		solutionForQuestionFive();
//		Write a Java program to get the number of days in a month
		solutionForQuestionSix();
//		Write a Java program to get localized day-of-week names.
		solutionForQuestionSeven();
//		Write a Java program to get a day of the week on a specific date.
		solutionForQuestionEight();
//		Write a Java program to get the current local time. 
		solutionForQuestionNine();
	}


	private static void solutionForQuestionNine() {
		LocalDateTime dateInLocale = LocalDateTime.now(ZoneId.of("America/Chicago"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE MM-dd-YYYY hh:mm:ss:a");
		String dateinString = dateInLocale.format(formatter);
		System.out.println("solutionForQuestionNine: " + dateinString);
	}


	private static void solutionForQuestionEight() {
		String day = LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
		System.out.println("solutionForQuestionEight: " + day);
	}


	private static void solutionForQuestionSeven() {
		String dayInGerman = null;
		System.out.println("solutionForQuestionSeven: ");
		for(DayOfWeek day : DayOfWeek.values()) {
			dayInGerman = day.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
			System.out.println(dayInGerman);
		}
		
	}


	private static void solutionForQuestionSix() {
		int noOfDaysInMonth = LocalDate.now().getMonth().maxLength();
		System.out.println("solutionForQuestionSix: " + noOfDaysInMonth);
		
	}


	private static void solutionForQuestionFive() {
		LocalDate date = LocalDate.now();
		LocalDate firstDayOfMonth = date.with(TemporalAdjusters.firstDayOfMonth());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd-MM-YYYY");
		String formattedDate = firstDayOfMonth.format(formatter);
		System.out.println("solutionForQuestionFive FirstDayOfMonth: " + formattedDate);
		LocalDate lastDayOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());
		formattedDate = lastDayOfMonth.format(formatter);
		System.out.println("solutionForQuestionFive LastDayOfMonth: " + formattedDate);
	}


	private static void solutionForQuestionFour() {
		LocalDate lastDayOfMonth = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");
		String lastDay = lastDayOfMonth.format(formatter);
		System.out.println("solutionForQuestionFour LastDayOfMonth: " + lastDay);
	}


	private static void solutionForQuestionOne() {
		LocalDateTime currentTimeStamp = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM-dd-YYYY");
		String dateInFormat = currentTimeStamp.format(dateTimeFormatter);
		System.out.println("SolutionForQuestionOne CurrentTimeStamp: " + dateInFormat);
	}
	private static void solutionForQuestionTwo() {
		LocalDateTime currentTimeStamp = LocalDateTime.now();
		int date = currentTimeStamp.getDayOfMonth();
		int month = currentTimeStamp.getMonthValue();
		
		int year = currentTimeStamp.getYear();
		String dateInFormat = date + "-" + month + "-" + year;
		System.out.println("SolutionForQuestionTwo CurrentTimeStamp: " + dateInFormat);
	}
	
	private static void solutionForQuestionThree() {
		ZoneId newYorkZone = ZoneId.of("America/New_York");
		ZonedDateTime zonedDateTime = ZonedDateTime.now(newYorkZone);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM-dd-YYYY HH:MM:SS");
		String dateInFormat = zonedDateTime.format(dateTimeFormatter);
		System.out.println("SolutionForQuestionThree CurrentTimeStamp: " + dateInFormat);
	}
}
