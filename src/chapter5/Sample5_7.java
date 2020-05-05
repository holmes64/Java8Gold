package chapter5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

// toArray()メソッドの例
public class Sample5_7 {
	public static void main(String[] args) {
		int[] ary1 = IntStream.range(1, 10).toArray();
		int[] ary2 = IntStream.rangeClosed(1, 10).toArray();
		Object[] ary3 = Stream.of("a", "b").toArray();
		String[] ary4 = Stream.of("a", "b").toArray(String[]::new);
		System.out.println("ary1 : " + ary1.length);
		System.out.println("ary2 : " + ary2.length);
		System.out.println("ary3 : " + ary3.getClass());
		System.out.println("ary4 : " + ary4.getClass());
	}
}
