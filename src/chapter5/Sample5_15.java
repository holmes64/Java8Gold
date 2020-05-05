package chapter5;

import java.util.Arrays;
import java.util.List;

public class Sample5_15 {
	public static void main(String[] args) {
		List<Integer> data1 = Arrays.asList(10);
		List<Integer> data2 = Arrays.asList(20, 30);
		List<Integer> data3 = Arrays.asList(40, 50, 60);
		List<List<Integer>> dataList = Arrays.asList(data1, data2, data3);
		
		// map()を使用した場合
		dataList.stream()
			.map(data -> data.stream())
			.forEach(l -> { l.forEach(x -> System.out.print(x + " "));});
		System.out.println();

		// flatMap()を用いた場合
		dataList.stream()
			.flatMap(data -> data.stream())
			.forEach(x -> System.out.print(x + " "));
	}
}
