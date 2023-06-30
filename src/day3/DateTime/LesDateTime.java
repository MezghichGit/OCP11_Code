package day3.DateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class LesDateTime {

	public static void main(String[] args) {
		// 1)Creation
		
		//LocalDate ld = LocalDate.now();
		LocalDate ld = LocalDate.of(2022, Month.FEBRUARY,28);
		System.out.println(ld);
		LocalTime lt = LocalTime.of(17, 06);
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		// 2)Manipulation
		
		//System.out.println(ld.plusMonths(2));
		//System.out.println(ld);
		Period period = Period.of(1, 2, 10);
		System.out.println(ld.plus(period));
		Duration duration = Duration.of(2, ChronoUnit.HOURS);
		System.out.println(lt.plus(duration));
		System.out.println(ldt);
		// 3)Formatting
		
		//DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		Locale locale = new Locale("en","US");
		Locale.setDefault(locale);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		//System.out.println(Locale.getDefault());
		
		System.out.println(Locale.getDefault());
		System.out.println(f.format(ld));
		System.out.println(ld.format(f));
		
		DateTimeFormatter custom = DateTimeFormatter.ofPattern("dd-MMM/yyyy::hh--mm");
		System.out.println(ldt.format(custom));
	}

}
