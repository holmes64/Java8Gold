package chapter5;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// toSet(), toMap()メソッドの使用例
public class Sample5_21 {
	public static void main(String[] args) {
		// toSet()メソッド
		Stream<String> stream1 = Stream.of("naoki", "akko", "ami");
		Set<String> set = stream1.collect(Collectors.toSet());
		System.out.println(set);
		
		// toMap()メソッド
		Stream<String> stream2 = Stream.of("naoki", "akko", "ami");
		Map<String, String> map = stream2.collect(Collectors.toMap(s -> s, String::toUpperCase));
		System.out.println(map);
	}
}
