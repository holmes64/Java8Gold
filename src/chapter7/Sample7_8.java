package chapter7;

import java.time.LocalDateTime;

// minusメソッドを使用した時刻減算例
public class Sample7_8 {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.of(2020, 5, 3, 18, 30, 00);
		System.out.println(dateTime);
		dateTime = dateTime.minusDays(1);
		dateTime = dateTime.minusHours(6);
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime);
		
		dateTime = dateTime.minusDays(1).minusHours(10).minusSeconds(30); // こっちのほうが書き方的にはきれい
		System.out.println(dateTime);
	}
}
