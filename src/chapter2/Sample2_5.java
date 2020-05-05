package chapter2;
// 抽象クラスを継承した抽象クラス
abstract class X{
	protected abstract void methodA();
}

abstract class Y extends X { } // 抽象クラス
class Z extends Y {
	protected void methodA() {} // 具象クラス
	// public void methodA(){} // publicでも公開範囲が広く`なるのでOK
	// void methodA(){} // これは公開範囲が狭くなるのでNG
}