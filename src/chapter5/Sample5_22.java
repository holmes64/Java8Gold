package chapter5;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// toMapメソッドの例その2
public class Sample5_22 {
	public static void main(String[] args) {
		// toMap()メソッド 1
		Stream<String> stream1 = Stream.of("naoki", "akko", "ami");
		Map<String, Integer> map1 = stream1.collect(Collectors.toMap(s -> s, String::length));
		System.out.println(map1);

		// toMap()メソッド 2 
		Stream<String> stream2 = Stream.of("naoki", "akko", "ami");
		Map<Integer, String> map2 = stream2.collect(Collectors.toMap(String::length, s -> s));
		System.out.println(map2);

	}
}
