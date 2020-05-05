package chapter7;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

// LocalDateTimeからInstatへの変換
public class Sample7_24 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, Month.JANUARY, 1);
		LocalTime time = LocalTime.of(11, 55);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		// Instant instant = dateTime.toInstant(); // コンパイルエラー
		Instant instant1 = dateTime.toInstant(ZoneOffset.of("+09:00"));

		// LocalDateTime →　ZonedDateTime → Instant
		ZonedDateTime zoneDt = dateTime.atZone(ZoneId.of("Asia/Tokyo"));
		Instant instant2 = zoneDt.toInstant();

		// LocalDateTime →　OffsetDateTime →　Instant
		OffsetDateTime offsetDt = dateTime.atOffset(ZoneOffset.of("+09:00"));
		Instant instant3 = offsetDt.toInstant();
		
		System.out.println(instant1);
		System.out.println(instant2);
		System.out.println(instant3);
	}
}
