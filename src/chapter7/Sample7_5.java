package chapter7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// IOS_DATEフォーマッタの利用例
public class Sample7_5 {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter fmt = DateTimeFormatter.ISO_DATE;
		System.out.println(dateTime);
		System.out.println(fmt.format(dateTime));
		System.out.println(dateTime.format(fmt));
	}
}
