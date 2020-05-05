package chapter7;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

// Instantクラスでの加算処理
public class Sample7_25 {
	public static void main(String[] args) {
		Instant instant1 = Instant.now();
		System.out.println("instant1 : " + instant1);

		Instant instant2 = instant1.plusSeconds(10);
		System.out.println("instant2 : " + instant2);

		Instant instant3 = instant1.plus(10, ChronoUnit.SECONDS);
		System.out.println("instant3 : " + instant3);
		
		Instant instant4 = instant1.plus(10, ChronoUnit.DAYS);
		System.out.println("instant4 : " + instant4);
		// 	Instant instant5 = instant1.plus(10, ChronoUnit.YEARS);
	}
}
