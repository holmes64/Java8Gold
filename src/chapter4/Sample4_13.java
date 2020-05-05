package chapter4;

import java.util.function.IntFunction;

// IntFunctionインタフェースの例
// それぞれの基本型に特化したインタフェース

public class Sample4_13 {
	public static void main(String[] args) {
		// IntFunction<String[]> obj1 = length -> new String[length];
		IntFunction<String[]> obj1 = String[]::new;
		System.out.println(obj1.apply(5).length);
	}
}
