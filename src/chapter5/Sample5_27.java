package chapter5;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// mapping()メソッドの例
public class Sample5_27 {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("naoki", "akko", "ami");
		String result1 = stream1.map(
				s -> s.toUpperCase()).collect(Collectors.joining(":"));
		System.out.println(result1);
		
		// mapping()メソッドの例
		Stream<String> stream2 = Stream.of("naoki", "akko", "ami");
		String result2 = stream2.collect(
				Collectors.mapping( s -> s.toUpperCase(), Collectors.joining(":")));
		System.out.println(result2);
	}
}
