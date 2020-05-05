package chapter4;

import java.util.function.Function;

// Functionインタフェースのapplyメソッドの利用
public class Sample4_3 {
	public static void main(String[] args) {
		// 匿名クラスを使用した場合
		String str1 = new Function<String, String>() {
			public String apply(String str) {
				return "Hello " + str;
			}
		}.apply("naoki");
		System.out.println("匿名クラス " + str1);
	
		
		// ラムダ式（省略なし）
		Function<String, String> f2 = (String str) -> {
			return "Hello " + str;
		};
		String str2 = f2.apply("naoki");
		System.out.println("ラムダ式省略なし " + str2);
	
		
		// ラムダ式（省略あり）
		Function<String, String> f3 = str -> "Helllo " + str;
		String str3 = f3.apply("naoki");
		System.out.println("ラムダ式省略あり " + str3);
	}
}
