package chapter2;
// 外部クラスでネストクラスをインスタンス化する
// これ重要★
// ネストクラスのインスタンス化方法①
class Outer19 { // 外側のクラス
	private int val1 = 100; // インスタンス変数
	private static int val2 = 200; // static変数
	class A19 { // 非staticメソッド(インナークラス)
		void method1() { // 非staticメソッド
			System.out.println("instance val :" + val1); }
			// static void method2() { // staticメソッド
			// System.out.println("static val : "+ val2);}
	}
	static class B19 { // staticクラス
		// void method1() { // 非staticメソッド
		// System.out.println("instance val "" + val1); }
		static void method2() { // staticメソッド
			System.out.println("staic val :" + val2); }
	}
}

public class Sample2_19 { // 外部のクラス
	public static void main(String[] args) {
		Outer19.A19 a = new Outer19().new A19(); // 非staticクラスのインスタンス化
		
		Outer19.B19 b = new Outer19.B19(); // staticクラスのインスタンス化
		a.method1();
		b.method2();
	}

}
