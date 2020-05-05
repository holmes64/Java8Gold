package chapter2;
import java.util.function.Function;
// 匿名クラスで実装した例
public class Sample2_26 {
	public static void main(String[] args) {
		String str = new Function<String, String>(){
			public String apply(String str) {
				return "Hello " + str;
			}
		}.apply("naoki");
		System.out.println(str);
	}
}
