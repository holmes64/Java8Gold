package chapter7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

// Periodクラスの加算処理2
public class Sample7_17 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, Month.JANUARY, 10);
		LocalTime time = LocalTime.of(7, 30);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Period period = Period.ofMonths(1);
		System.out.println(dateTime);
		System.out.println(dateTime.plus(period));
		System.out.println(date);
		System.out.println(date.plus(period));
//		System.out.println(time.plus(period));
	}
}
