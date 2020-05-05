package chapter5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// ストリームAPIの例
public class Sample5_1 {
	public static void main(String[] args) {
		// ソース
		List<String> list = Arrays.asList("bb", "aa", "cc");
		
		// 実装例1
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i).toUpperCase();
			list.set(i, str);
		}
		
		Collections.sort(list);
		for(String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// 実装例2
		list.stream().sorted().forEach(s -> System.out.print(s + " "));
	}
}
