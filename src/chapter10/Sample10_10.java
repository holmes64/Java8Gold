package chapter10;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// ConcurrentHashMapクラスの利用
// 10_8の改良版
public class Sample10_10 {
	public static void main(String[] args){
		Map<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "tanaka");
		map.put(2, "urai");
		for(Integer key : map.keySet()) { map.remove(key); }
	}
}
