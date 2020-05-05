package chapter3;
// ダイヤモンド演算子を用いたgenericタイプでの書き方
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Sample3_12 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "A");
		List<String> list1 = new ArrayList<>();
		list1.add("B");
		methodA(new ArrayList<>()); // SE8よりOK
		List<String> list2 = methodB();
	}
	
	static void methodA(List<String> list) {
		System.out.println("methodA()");
	}
	
	// static ArrayList<> methodB() { // NG
	static ArrayList<String> methodB() {
		System.out.println("methodB()");
		return new ArrayList();
	}
}
