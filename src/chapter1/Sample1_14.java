package chapter1;
// staticインポート
// out変数はSystemクラスのstatic変数
import static java.lang.System.out;

// random()メソッドはMathクラスのstaticメソッド
import static java.lang.Math.random;

public class Sample1_14 {
	public static void main(String[] args) {
		// staticインポートしたstaticメンバを使用したコード
		out.println(random());
		
		// staticインポートを使用しないコード
		System.out.println(Math.random());
	}
}
