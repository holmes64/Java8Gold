package chapter2;
// デフォルトメソッドは実装クラスでオーバーライドする
interface MyInter12 {
	default void method() { System.out.println("MyInter12"); }
}

class MyClass12 implements MyInter12 {
	@Override
	public void method() { System.out.println("MyClass1"); }
}