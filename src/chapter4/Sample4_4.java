package chapter4;
import java.util.function.Function;
// 暗黙的finalを確認する
public class Sample4_4 {
	int a = 10;
	
	public void method() {
		final int b = 20;
		int c = 30; // 暗黙的ファイナル
		int d = 40;
		d = 50;
		int e = 60; // 暗黙的ファイナル
		Function<String, String> f1 = (String str) -> {
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
			// System.out.println("d : " + d); // コンパイルエラー
			return "Hello " + str;
		};
		System.out.println(f1.apply("naoki"));
	}
	
	public static void main(String[] args) {
		new Sample4_4().method();
	}
}
