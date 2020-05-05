package chapter2;
import java.util.function.Function;
// Functionインタフェースの実装クラス
class MyFunc implements Function<String, String>{
	public String apply(String str) {
		return "Hello " + str; 
	}
}

public class Sample2_25 {
	public static void main(String[] args) {
		MyFunc obj = new MyFunc();
		String str = obj.apply("naoki");
		System.out.println(str);
	}
}
