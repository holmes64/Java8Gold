package chapter4;

import java.util.Arrays;
import java.util.List;

// インスタンスメソッド参照の例
public class Sample4_8 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 1, 2);
		// foreachを使用しない
		// for(int a : list) { System.out.print(a); }
		// forEachを使用、かつラムダ式を引数に渡す
		// list.forEach( a -> System.out.print(a) );
		
		// インスタンスメソッド参照
		list.forEach(System.out::print);
	}
}
