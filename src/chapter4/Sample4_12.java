package chapter4;
// コンストラクタの参照2
import java.util.function.Function;

public class Sample4_12 {
	public static void main(String[] args) {
		// Function<Integer, String[]> obj1 = length -> new String[length];
		Function<Integer, String[]> obj1 = String[]::new;
		System.out.println(obj1.apply(5).length);
	}
}
