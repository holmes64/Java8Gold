package chapter7;

import java.time.LocalDate;

// LocalDateでの日付計算
public class Sample7_7 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, 05, 03);
		System.out.println("date   : " + date);
		System.out.println("三日後   : " + date.plusDays(3));
		System.out.println("五ヶ月後  : " + date.plusMonths(5));
		System.out.println("二週間後   : " + date.plusWeeks(2));
		System.out.println("十年後   : " + date.plusYears(10));
		System.out.println("date   : " + date);
	}
}
