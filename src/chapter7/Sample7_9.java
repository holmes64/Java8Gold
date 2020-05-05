package chapter7;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

// ZoneIdとZonedDateTimeクラスの利用
public class Sample7_9 {
	public static void main(String[] args) {
		ZoneId zone1 = ZoneId.systemDefault();
		LocalDateTime lDateTime1 = LocalDateTime.of(2020, 5, 3, 22, 13, 50, 000);
		ZonedDateTime zDateTime1 = ZonedDateTime.of(lDateTime1, zone1);
		System.out.println(zDateTime1);
		
		ZoneId zone2 = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zDateTime2 = ZonedDateTime.of(2020, 5, 3, 22, 13, 50, 000, zone2);
		System.out.println(zDateTime2);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
		System.out.println(fmt1.format(zDateTime1));
	}
}
