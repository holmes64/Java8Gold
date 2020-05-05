package chapter4;

import java.util.function.UnaryOperator;

// インスタンスメソッド参照の例2
public class Sample4_9 {
	public static void main(String[] args) {
		// UnaryOperator<String obj> = s -> s.toUpperCase(); // ラムダ式
		// UnaryOperator<String obj> = s -> s::toUpperCase(); // コンパイルエラー
		UnaryOperator<String> obj = String::toUpperCase;
		System.out.println(obj.apply("naoki"));
	}
}
