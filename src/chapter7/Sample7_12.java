package chapter7;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;

// 夏時間を確認する例2
public class Sample7_12 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
		LocalTime time = LocalTime.of(1, 30);
		ZoneId zone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zoneDt = ZonedDateTime.of(date, time, zone);
		System.out.println(zoneDt);
		zoneDt = zoneDt.plusHours(1);
		System.out.println(zoneDt);
	}
}
