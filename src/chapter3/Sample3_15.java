package chapter3;

// ジェネリクスを用いたインタフェース宣言
interface MyIn<T> { void method(T t); }

class Foo implements MyIn<String> { // 実装クラス1
	public void method(String s) { System.out.println(s); }
}

class Bar implements MyIn<Integer> { // 実装クラス2
	public void method(Integer i) { System.out.println(i); }
}

public class Sample3_15 {
	public static void main(String[] args) {
		new Foo().method("ABA");
		new Bar().method(10);
	}
}
