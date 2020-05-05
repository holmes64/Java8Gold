package chapter7;

import java.time.Period;

// Periodクラスの例2
public class Sample7_15 {
	public static void main(String[] args) {
		Period period1 = Period.ofYears(2);
		Period period2 = Period.ofWeeks(3);
		Period period3 = Period.ofYears(1).ofMonths(1);
		Period period4 = Period.of(0, 10, 50);
		System.out.println("period1 : " + period1);
		System.out.println("period2 : " + period2);
		System.out.println("period3 : " + period3);
		System.out.println("period4 : " + period4);
	}
}
