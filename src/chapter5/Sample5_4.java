package chapter5;

import java.util.stream.Stream;

// count(), forEach()メソッドのコード例
public class Sample5_4 {
	public static void main(String[] args) {
		long result1 = Stream.of("a", "b", "c").count();
		System.out.println(result1);
		Stream<String> stream1 = Stream.of("a", "b", "c");
		stream1.forEach(System.out::print);
		// for(String s : stream) { System.out.print(s); } // Iterableを継承していないため、コンパイルエラーとなる
	}
}
