package chapter4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

// staticメソッド参照の例その１
public class Sample4_6 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 1, 2);
//		// 匿名クラスを使用した場合
//		Consumer<List<Integer>> con1 = new Consumer<List<Integer>>() {
//			public void accept(List<Integer> list) {
//				Collections.sort(list);
//			}
//		};

//		// ラムダ式を使用した場合
//		Consumer<List<Integer>> con1 = lambdaList -> Collections.sort(lambdaList);
		
		// メソッド参照を用いた場合
		Consumer<List<Integer>> con1 = Collections::sort;
		con1.accept(list);
		System.out.println(list);
	}
}
