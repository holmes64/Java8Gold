package chapter3;

import java.util.ArrayDeque;
import java.util.Queue;

// Queueインタフェースを使用した例2
public class Sample3_7 {
	public static void main(String[] args) {
		Queue<String> queue = new ArrayDeque<String>();
		queue.offer("1");
		queue.offer("2");
		for(; 0 < queue.size();) { queue.poll(); }
		System.out.println(queue.peek()); // nullが返る
//		System.out.println(queue.element()); // 例外がスロー
	}
}
