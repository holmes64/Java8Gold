package chapter7;

import java.time.Duration;

// DurationクラスのofXXXの例1
public class Sample7_18 {
	public static void main(String[] args) {
		System.out.println(Duration.ofDays(1));
		System.out.println(Duration.ofHours(1));
		System.out.println(Duration.ofMinutes(1));
		System.out.println(Duration.ofSeconds(1));
		System.out.println(Duration.ofMillis(1));
		System.out.println(Duration.ofNanos(1));
	}
}
