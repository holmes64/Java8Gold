package chapter7;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

// PeriodクラスとDurationクラス
public class Sample7_21 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, Month.JANUARY, 10);
		LocalTime time = LocalTime.of(7, 30);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Period period = Period.ofDays(1);
		Duration duration = Duration.ofDays(1);
		System.out.println(date.plus(period));
//		System.out.println(date.plus(duration));
//		System.out.println(time.plus(period)); // UnsupportedTemporalTypeExceptionがスローされる
		System.out.println(time.plus(duration));
		System.out.println(dateTime.plus(period));
		System.out.println(dateTime.plus(duration));
	}
}
