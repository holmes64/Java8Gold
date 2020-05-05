package chapter5;

import java.util.stream.IntStream;
import java.util.stream.Stream;
// limit(), skip()メソッドのコード例
public class Sample5_13 {
	public static void main(String[] args) {
		IntStream.iterate(1, n -> n+1).limit(10L).forEach(x -> System.out.print(x + " "));
		System.out.println();

		IntStream.rangeClosed(1, 10).skip(5L).forEach(x -> System.out.print(x + " "));
		System.out.println();

		IntStream.iterate(1, n -> n + 1).skip(100L).limit(5L).forEach(x -> System.out.print(x + " "));
		System.out.println();
		Stream<String> stream = Stream.generate(() -> "Java");
			stream.limit(3L).forEach(x -> System.out.print(x + " "));
	}
}
