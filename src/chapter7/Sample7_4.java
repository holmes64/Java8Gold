package chapter7;

import java.time.LocalDateTime;
import java.time.LocalTime;

// LocalTime, LocalDateTimeのofメソッドの使用例
public class Sample7_4 {
	public static void main(String[] args) {
		// LocalTimeのof()メソッドの利用
		LocalTime lt1 = LocalTime.of(3, 15);
		LocalTime lt2 = LocalTime.of(3, 15, 30);
		LocalTime lt3 = LocalTime.of(3, 15, 30, 180);
		System.out.println("1: " + lt1);
		System.out.println("2: " + lt2);
		System.out.println("3: " + lt3);
		
		// LocalDateTimeのofメソッドの利用
		LocalDateTime ldt1 = LocalDateTime.of(2020, 5, 3, 3, 15);
		LocalDateTime ldt2 = LocalDateTime.of(2020, 5, 3, 3, 15, 30);
		LocalDateTime ldt3 = LocalDateTime.of(2020, 5, 3, 3, 15, 30, 180);
		System.out.println("4: " + ldt1);
		System.out.println("5: " + ldt2);
		System.out.println("6: " + ldt3);
	}
}
