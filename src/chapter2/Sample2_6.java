package chapter2;

// 抽象クラスを継承した具象クラス
abstract class X2 {
	abstract void methodA(); // 抽象メソッド
	void methodB() {} //具象メソッド
}

//abstract class Y2 extends X2 {
//	// 12行目はmethodA()をオーバーライドするつもりが
//	// 間違えてmethod()として定義した場合
//	void method() {} // 具象メソッド
//	abstract void methodC(); // 抽象メソッド
//}

abstract class Y2 extends X2 {
	@Override
	void methodA() {} // 具象メソッド
	abstract void methodC(); // 抽象メソッド
}