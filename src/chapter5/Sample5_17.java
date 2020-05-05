package chapter5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// peek()メソッドの使用例
// Consumerインタフェースを使用しているため、何かしらの処理を実行し、その確認にコードを使用する
public class Sample5_17 {
	public static void main(String[] args) {
		List<String> list = Stream.of("one", "three", "two", "three", "four")
				.filter(s -> s.length() > 3)
				.peek(e -> System.out.println("フィルタ後: " + e))
				.distinct()
				.map(String::toUpperCase)
				.peek(e -> System.out.println("マップ後: " + e))
				.collect(Collectors.toList());
	}
}
