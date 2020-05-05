package chapter7;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

// Periodクラスの加算処理
public class Sample7_16 {
	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2016, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2016, Month.JANUARY, 15);
		Period period = Period.between(start, end);
		System.out.println(period.getDays());
		period = period.plusDays(6);
		System.out.println(period.getDays());
	}
}
