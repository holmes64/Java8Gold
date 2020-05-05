package chapter7;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

// ZonedDateTimeからInstantへの変換
public class Sample7_23 {
	public static void main(String[] args) {
		Instant instant1 = Instant.ofEpochSecond(0);
		System.out.println(instant1);
		LocalDate date = LocalDate.of(2016, Month.JANUARY, 1);
		LocalTime time = LocalTime.of(11, 55);
		ZoneId zone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zoneDt = ZonedDateTime.of(date, time, zone);
		Instant instant2 = zoneDt.toInstant();
		System.out.println(zoneDt);
		System.out.println(instant2);
	}
}
