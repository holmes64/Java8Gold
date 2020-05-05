package chapter5;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

// reduceメソッドのコード例2
public class Sample5_6 {
	public static void main(String[] args) {
		BinaryOperator<Integer> operator = (a, b) -> a + b;
		Stream<Integer> stream1 = Stream.of(10, 20, 30);
		// int result = stream1.reduce(operator);
		Optional<Integer> result = stream1.reduce(operator);
		result.ifPresent(System.out::println); // 出力は60
		
		Stream<Integer> stream2 = Stream.empty();
		Optional<Integer> result2 = stream2.reduce(operator);
		System.out.println(result2); // 出力はOptional.empty
		result2.ifPresent(System.out::println); // 出力データなし
	}
}
