package chapter7;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

// ZoneOffsetとOffsetDateTimeクラスの利用
public class Sample7_10 {
	public static void main(String[] args) {
		ZoneOffset offset = ZoneOffset.of("+09:00");
		LocalDateTime lDateTime = LocalDateTime.of(2020, 5, 3,
												22, 13, 50, 000);
		OffsetDateTime oDateTime = OffsetDateTime.of(lDateTime, offset);
		System.out.println(oDateTime);
	}
}
