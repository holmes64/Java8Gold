package chapter2;
// Java言語は常に実装クラスを優先する

interface A16 {
	void method(); // 抽象メソッド
}

interface X16 extends A16 { // Aインターフェースのサブインターフェース
	@Override
	default void method() { System.out.println("X"); }
}

class Y16 implements A16 { // インターフェースの実装クラス
	@Override
	public void method() { System.out.println("Y"); }
}

class MyClass16 extends Y16 implements X16{ }

public class Sample2_16 {
	public static void main(String[] args) {
		MyClass16 obj = new MyClass16();
		obj.method();
	}
}
