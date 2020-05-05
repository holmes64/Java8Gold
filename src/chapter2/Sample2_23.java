package chapter2;
// 匿名クラスの定義例1
interface MyInter23 { void methodA(); }
class Outer23 {
	void method() {
		new MyInter23() {
			public void methodA() {
				System.out.println("methodA()");
			}
		}.methodA(); // 匿名クラスのメソッド呼び出し
	}
}

public class Sample2_23 {
	public static void main(String[] args) {
		new Outer23().method();
	}
}
