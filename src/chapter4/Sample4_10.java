package chapter4;

import java.util.function.BiFunction;

// インスタンスメソッド参照の例3
public class Sample4_10 {
	public static void main(String[] args) {
		// ラムダ式1 OK
		// BiFunction<String, Integer, Character> obj = (s, i) -> s.charAt(i);
		// System.out.println(obj.apply("Java", 2));
		
		// ラムダ式2 OK
		// BiFunction<String, String, Character> obj = (i, s) -> s.charAt(i):
		// System.out.println(obj.apply("Java", 2));
	
		// インスタンスメソッド参照1 OK
		BiFunction<String, Integer, Character> obj = String::charAt;
		System.out.println(obj.apply("Java", 2));

		// インスタンスメソッド参照2 NG
//		BiFunction<String, Integer, Character> obj = String::charAt;
//		System.out.println(obj.apply(2, "Java"));
		
	}
}
