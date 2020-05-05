package chapter5;

import java.util.Optional;
import java.util.stream.Stream;

// orElse(), orElseGet(), orElseThrow()メソッドのコード例
public class Sample5_11 {
	public static void main(String[] args) {
		Stream<Double> stream = Stream.empty();
		Optional<Double> result = stream.findFirst();
		// System.out.println(result.get());
		System.out.println(result.orElse(0.0));
		System.out.println(result.orElseGet(() -> Math.random()));
		System.out.println(result.orElseThrow(IllegalArgumentException::new));
		// System.out.println(result.orElseThrow( () -> new IllegalArgumentException() ));
	}
}
