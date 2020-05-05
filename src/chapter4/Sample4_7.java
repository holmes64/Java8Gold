package chapter4;

import java.util.Comparator;

// staticメソッドの参照例2
public class Sample4_7 {
	public static void main(String[] args) {
		// ラムダ式
		// Comparator<Integer> comp = (x, y) -> Integer.compare(x, y);
		
		// staticメソッド参照
		Comparator<Integer> comp = Integer::compare;
		System.out.println(comp.compare(1, 2));
		System.out.println(comp.compare(2, 1));
	}
}
