package chapter3;

import java.util.ArrayDeque;
import java.util.Queue;

public class Sample3_6 {
	public static void main(String[] args) {
		Queue<String> queue = new ArrayDeque<String>();
		queue.offer("1");  queue.offer("2"); queue.offer("3");
		System.out.println(queue);
		System.out.println("peek() : " + queue.peek());
		System.out.println(queue);
		System.out.println("remove() : " + queue.remove());
		System.out.println(queue);
	}
}
