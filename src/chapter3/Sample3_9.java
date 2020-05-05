package chapter3;

import java.util.HashMap;

public class Sample3_9 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "AAA");  map.put(1, "BBB");
		map.put(2, "AAA"); // 値の重複
		map.put(1, "CCC"); // キーの重複
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("XXX"));
		for(int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i) + " ");
		}
	}
}
