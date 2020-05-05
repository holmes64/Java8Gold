package chapter7;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

// Durationクラス()のofXXX()の例2
public class Sample7_19 {
	public static void main(String[] args) {
		Duration duration1 = Duration.ofSeconds(12);
		Duration duration2 = Duration.ofSeconds(12, 300_000_000);
		Duration duration3 = Duration.of(12, ChronoUnit.SECONDS);
		
		System.out.println("duration1 : " + duration1);
		System.out.println("duration1 : " + duration2);
		System.out.println("duration1 : " + duration3);
	}
}
