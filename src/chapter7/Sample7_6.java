package chapter7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// ofPattern()メソッドの使用例
public class Sample7_6 {
	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MMMM");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MMMM", Locale.US);
		LocalDate date = LocalDate.now();
		System.out.println("デフォルトロケール: " + date.format(fmt1));
		System.out.println("USロケール: " + date.format(fmt2));
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String target = "2020/05/03 18:13:45";
		
		LocalDateTime dateTime = LocalDateTime.parse(target, fmt3);
		System.out.println(dateTime);
		
	}
}
