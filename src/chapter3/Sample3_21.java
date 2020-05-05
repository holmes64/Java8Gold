package chapter3;
// asList()　メソッドの使用
import java.util.*;

public class Sample3_21 {
	public static void main(String[] args) {
		String[ ]  ary = {"A", "B", "C"};
		List<String> list = Arrays.asList(ary);
		// list.add("0");
		list.set(2, "D");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}