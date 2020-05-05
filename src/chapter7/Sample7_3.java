package chapter7;

import java.time.LocalDate;
import java.time.Month;

// Monthの利用例
public class Sample7_3 {
	public static void main(String[] args) {
		// LocalDate dateOf = LocalDate.of(2020, 05, 03);
		LocalDate dateOf = LocalDate.of(2020, Month.MAY, 03);
		System.out.println(dateOf);
		Month m = Month.MAY;
		// boolean result1 = m == 5; // 列挙型とint型の比較になるのでエラーになる
		boolean result2 = m == Month.MAY;
		
		System.out.println(result2);
		System.out.println("getYear() : " + dateOf.getYear());
		System.out.println("getMonth() : " + dateOf.getMonth());
		System.out.println("getMonthValue() : " + dateOf.getMonthValue());
		System.out.println("getDayOfMonth() : " + dateOf.getDayOfMonth());
	}
}
