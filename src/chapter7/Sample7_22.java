package chapter7;

import java.time.Duration;
import java.time.Instant;

// Instantクラスの利用
public class Sample7_22 {
	public static void main(String[] args) {
		Instant pointA = Instant.now();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Instant pointB = Instant.now();
		Duration duration = Duration.between(pointA, pointB);
		System.out.println(pointA);
		System.out.println(pointB);
		System.out.println(duration.toMillis());
	}
}
