package chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// ストリームオブジェクトの生成例
public class Sample5_2 {
	public static void main(String[] args) {
		List<String> data1 = Arrays.asList("a", "b", "c");
		Stream<String> stream1 = data1.stream();
		int[] data2 = {1, 2, 3};
		IntStream stream2 = Arrays.stream(data2);
		Stream<String> stream3 = Stream.of("abc");
		Stream<Long> stream4 = Stream.of(1L, 2L, 3L);
		DoubleStream stream5 = DoubleStream.of(1.0, 2.0, 3.0);
	}
}
