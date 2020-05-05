package chapter5;

import java.util.stream.IntStream;
import java.util.stream.Stream;
//ストリームインタフェースの型変換
public class Sample5_18 {
	public static void main(String[] args) {
		// 1. Stream<String> -> Stream<Intger>
		Stream<String> stream1o = Stream.of("a", "b");
		Stream<Integer> stream1n = stream1o.map( s -> s.length());
		
		// 2. Stream<String> -> IntStream
		Stream<String> stream2o = Stream.of("naoki", "akko", "ami");
		IntStream stream2n = stream2o.mapToInt( s -> s.length());
		
		// 3. Stream<Integer> -> IntStream
		Stream<Integer> stream3o = Stream.of(1, 2, 3);
		IntStream stream3n = stream3o.mapToInt( n -> n);
	
		// 4. Stream<Integer> -> Stream<Strng>
		Stream<Integer> stream4o = Stream.of(1, 2, 3);
		Stream<String> stream4n = stream4o.map( n -> n + "a");
	
		// 5. IntStream -> Stream<Strng>
		IntStream stream5o = IntStream.of(1, 2, 3);
		Stream<String> stream5n = stream5o.mapToObj( n -> n + "a");

		// 6. IntStream -> Stream<Integer>
		IntStream stream6o = IntStream.of(1, 2, 3);
		Stream<Integer> stream6n = stream6o.boxed();
	}
}
