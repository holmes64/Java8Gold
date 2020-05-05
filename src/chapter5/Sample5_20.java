package chapter5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// toList(), joining(), summingInt(), aveagingInt()メソッドのコード例
public class Sample5_20 {
	public static void main(String[] args) {
		// toListメソッド
		Stream<String> stream1 = Stream.of("naoki", "akko", "ami");
		List<String> result1 = stream1.collect(Collectors.toList());
		System.out.println(result1);
		
		// joiningメソッド
		Stream<String> stream2 = Stream.of("naoki", "akko", "ami");
		String result2 = stream2.collect(Collectors.joining(" | "));
		System.out.println(result2);

		// summingIntメソッド
		Stream<String> stream3 = Stream.of("naoki", "akko", "ami");
		Integer result3 = stream3.collect(Collectors.summingInt(t -> t.length()));
		System.out.println(result3);

		// averagingIntメソッド
		Stream<String> stream4 = Stream.of("naoki", "akko", "ami");
		Double result4 = stream4.collect(Collectors.averagingInt(t -> t.length()));
		System.out.println(result4);
	}
}
