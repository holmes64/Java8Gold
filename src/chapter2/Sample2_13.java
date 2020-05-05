package chapter2;
// 2つのインターフェースを実装しする。

interface A13{
	void method(); // 抽象メソッド
}

interface X13 extends A13 { // Aインターフェースのサブインターフェース
	@Override
	default void method() { System.out.println("X"); }
}

interface Y13 extends A13 { // Aインターフェースのサブインターフェース
	@Override
	default void method() { System.out.println("Y"); }
}

// class Myclass13 implements X13, Y13 {} // このクラスが原因でコンパイルエラーとなる