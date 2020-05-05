package chapter5;

import java.util.Comparator;
import java.util.stream.Stream;

// sorted()メソッドの使用
public class Sample5_16 {
	public static void main(String[] atgs) {
		Stream.of("naoki", "akko", "ami")
			.sorted()
			.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		Stream.of("naoki", "akko", "ami")
			.sorted(Comparator.reverseOrder())
			.forEach(x -> System.out.print(x + " "));
	}
}
