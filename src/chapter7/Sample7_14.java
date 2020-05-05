package chapter7;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

// Periodクラスの例
public class Sample7_14 {
	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2016, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2017, Month.MARCH, 5);
		Period period = Period.between(start, end);
		System.out.println("period   : " + period);
		System.out.println("getYears()   : " + period.getYears());
		System.out.println("getMonths   : " + period.getMonths());
		System.out.println("getDays()   : " + period.getDays());
	}
}
