package chapter5;

import java.util.stream.Stream;

// filter(), distinct()メソッド
public class Sample5_12 {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("ami", "naoki", "aiko");
		stream1.filter(s -> s.startsWith("a")).forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		Stream<String> stream2 = Stream.of("ami", "naoki", "aiko", "ami");
		stream2.distinct().forEach(x -> System.out.print(x + " "));
	}
}
