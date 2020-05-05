package chapter7;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

// 夏時間を確認する例1
public class Sample7_11 {
	public static void main(String[] args) {
		ZoneId zone = ZoneId.of("America/Los_Angeles");
		LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
		LocalTime time1 = LocalTime.of(1, 00); // 切り替え前
		LocalTime time2 = LocalTime.of(2, 00); // 切り替え中
		ZonedDateTime zoneDt1 = ZonedDateTime.of(date, time1, zone);
		System.out.println(zoneDt1);
		
		ZonedDateTime zoneDt2 = ZonedDateTime.of(date, time2, zone);
		System.out.println(zoneDt2);
	}
}
