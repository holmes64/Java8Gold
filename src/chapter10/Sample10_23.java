package chapter10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// シーケンシャルとパラレル
public class Sample10_23 {
	public static void main(String[] args){
		IntStream stream = IntStream.range(1, 3000);
		List<Integer> list = stream.boxed()
								.collect(Collectors.toList());
		long start = System.nanoTime();
		new Sample10_23().foo(list);
		System.out.println(System.nanoTime() - start);
	}
	
	void foo(List<Integer> list) {
		long count = list.stream().map(a -> task(a)).count();
//		 long count = list.parallelStream().map( a -> task(a)).count(); // パラレルのほうがはやい
		System.out.println(count);
	}
	
	int task(int num) {
		try {
			Thread.sleep(5);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		return ++num;
	}
}
